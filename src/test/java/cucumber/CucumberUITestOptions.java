package cucumber;

import base.BaseTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty"},
    glue = {"cucumber.stepdefs"},
    features = {"src/test/java/cucumber/features"})
public class CucumberUITestOptions {

  @BeforeClass
  public static void setUp() {
    BaseTests.launchApplication();
  }

  @AfterClass
  public static void tearDown() {
    BaseTests.closeBrowser();

  }
}
