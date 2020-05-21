package services;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PetStoreProvider {
    public static String PET_ENDPOINT = "https://petstore.swagger.io/v2/pet" ;
    private RequestSpecification requestSpecification;
    public List<Pet> getPetsByStatus(Status status) {
        return given(requestSpecification)
                .queryParam("status", Status.available.toString())
                .get(PET_ENDPOINT + "/findByStatus")
                .then().log().all()
                .extract().body()
                .jsonPath().getList("", Pet.class);

    }


    public int statusCodeBasedOnPetStatus(String petStatus){
        RestAssured.baseURI=PET_ENDPOINT;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = getResponse(petStatus, httpRequest);
        return responseCode(response);
    }

    public int numberOfPetsByStatus(String petStatus) {
        RestAssured.baseURI=PET_ENDPOINT;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = getResponse(petStatus, httpRequest);
        JsonPath path=response.body().jsonPath();
        List<HashMap<String, Object>> jsonObjects = path.getList("id");
       return jsonObjects.size();
    }

    private Response getResponse(String petStatus, RequestSpecification httpRequest) {
        return httpRequest
                .queryParam("status", petStatus)
                .get(RestAssured.baseURI + "/findByStatus");
    }

    public int responseCode(Response response) {
        return response.getStatusCode();
    }


}
