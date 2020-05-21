import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import services.Category;
import services.Pet;
import services.PetStoreProvider;
import services.Tag;

import java.util.Collections;

import static services.PetStoreProvider.PET_ENDPOINT;
import static services.Status.available;

public class PetTests {
  private static final String PHOTO = "test.png";
  private static final String baseUri = PET_ENDPOINT;
//  public PetStoreProvider PetStoreProvider;
  Pet pet =
      new Pet.Builder()
          .withId(RandomStringUtils.randomNumeric(10))
          .withName("My pet")
          .withPhotoUrls(Collections.singletonList(PHOTO))
          .withStatus(available)
          .withTags(Collections.singletonList(new Tag(1, "golden-retriever")))
          .inCategory(new Category(1, "dogs"))
          .build();

  /*  @BeforeClass
  public static void beforeClass() {
    services.PetStoreProvider petStoreProvider = new PetStoreProvider();
  }*/

  @Test
  public void findPetsByStatusAvailableTest() {
    int numberofPetsByAvailableStatus = new PetStoreProvider().numberOfPetsByStatus("available");
    Assert.assertEquals(702, numberofPetsByAvailableStatus);
    Assert.assertEquals (200, new PetStoreProvider().statusCodeBasedOnPetStatus("available"));
  }

  @Test
  public void findPetsByStatusPendingTest() {
    int numberofPetsByAvailablePending = new PetStoreProvider().numberOfPetsByStatus("pending");
    Assert.assertEquals(0, numberofPetsByAvailablePending);
    Assert.assertEquals (200, new PetStoreProvider().statusCodeBasedOnPetStatus("pending"));

  }

  @Test
  public void findPetsByStatusSoldTest() {
    int numberofPetsBySoldStatus = new PetStoreProvider().numberOfPetsByStatus("sold");
    Assert.assertEquals(6, numberofPetsBySoldStatus);
    Assert.assertEquals (200, new PetStoreProvider().statusCodeBasedOnPetStatus("findPetsByStatusSold"));
  }

  @Test
  public void findPetsWithoutStatus() {
    int numberofPetsByNullStatus = new PetStoreProvider().numberOfPetsByStatus("");
    Assert.assertEquals(0, numberofPetsByNullStatus);
    Assert.assertEquals (200, new PetStoreProvider().statusCodeBasedOnPetStatus(""));
  }

}
