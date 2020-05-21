package utils;

import org.openqa.selenium.WebDriver;
import pages.WikiHomePage;

public class NavigationUtils {

  public static WikiHomePage goToHomePage(WebDriver driver) {
    driver.get(System.getProperty("app.url"));
    return new WikiHomePage(driver);
  }
}
