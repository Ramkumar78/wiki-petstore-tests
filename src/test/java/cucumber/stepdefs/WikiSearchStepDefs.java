package cucumber.stepdefs;

import base.BaseTests;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WikiHomePage;
import pages.WikiSearchResultPage;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WikiSearchStepDefs extends BaseTests {

  @Given("I search for {string} and select {string} as the language of choice")
  public void i_search_for_and_select_as_the_language_of_choice(
      String searchText, String language) {
    new WikiSearchResultPage(driver).searchTextSelectLanguage(searchText, language);
  }

  @Then("the Search result should be displayed with the first heading containing {string}")
  public void the_Search_result_should_be_displayed_with_the_first_heading_containing(
      String searchText) {
    assertTrue(new WikiHomePage(driver).isFirstheadingSameasSearchText(searchText));
  }

  @Then("the search result should be available in {string} language")
  public void the_search_result_should_be_available_in_language(String language) {
    assertTrue(new WikiHomePage(driver).checkIfSomeResultExistInOtherLanguage(language));
  }

  @Then("I select {string} language option and result is displayed in {string}")
  public void i_select_language_and_result_is_displayed_in(String language, String languageCode) {
    String currentUrl=new WikiHomePage(driver).displayResultInThisLanguage(language);
    Assert.assertThat(currentUrl,containsString(languageCode));
  }
}
