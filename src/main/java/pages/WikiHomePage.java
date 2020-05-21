package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiHomePage  {
  private By firstHeading = By.id("firstHeading");

  private WebDriver driver;

  public WikiHomePage(WebDriver driver) {
    this.driver = driver;
  }

  public String firstSearchResult() {
    return driver.findElement(firstHeading).getText();
  }

  public boolean isFirstheadingSameasSearchText(String SearchText) {
    return firstSearchResult().equalsIgnoreCase(SearchText);
  }

  public boolean checkIfSomeResultExistInOtherLanguage(String language) {
    By languageLink = getByLanguageLink(language);
    return driver.findElement(languageLink).getText().equals(language);
  }

  public String displayResultInThisLanguage(String language) {
    By languageLink = getByLanguageLink(language);
    driver.findElement(languageLink).click();
    return driver.getCurrentUrl();
  }

  private By getByLanguageLink(String language) {
    return By.linkText(language);
  }
}
