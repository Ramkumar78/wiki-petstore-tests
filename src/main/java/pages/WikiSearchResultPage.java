package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikiSearchResultPage {

WebDriver driver;

  private By searchField = By.id("searchInput");
  private By languageDropdown = By.id("searchLanguage");
  private By searchButton = By.cssSelector(".svg-search-icon");

 public WikiSearchResultPage(WebDriver driver) {
    this.driver = driver;
    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.textToBe(By.cssSelector(".central-textlogo__image"), "Wikipedia"));
  }

  public void searchTextSelectLanguage(String searchText, String language) {

    WebElement selectLanguagDropDown = driver.findElement(languageDropdown);
    driver.findElement(searchField).sendKeys(searchText);
    selectLanguagDropDown.click();
    String selectedLanguage = selectLanguagDropDown.getText();
    if (!selectedLanguage.equals(language)) {
      selectLanguagDropDown.findElement(By.xpath("//option[. = '"+language+"']")).click();
    }
    driver.findElement(searchButton).click();
  }
}
