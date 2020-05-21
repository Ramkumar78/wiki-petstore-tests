package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTests {

  protected static WebDriver driver;

  @BeforeClass
  public static void launchApplication() {
    Properties props = System.getProperties();
    try {
      props.load(new FileInputStream(new File("resources/test.properties")));
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }
    System.setProperty("webdriver.chrome.driver", System.getProperty("webdriver.chrome.driver"));
    driver = new ChromeDriver();
    driver.get(System.getProperty("app.url"));
  }

  @AfterClass
  public static void closeBrowser() {
    driver.quit();
  }
}
