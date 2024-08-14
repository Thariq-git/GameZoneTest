package GameZone.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GameZoneTest {
  private WebDriver webDriver;

  @Test
  public void checkRegistration() {
      // Load the registration page
      webDriver.navigate().to("http://localhost:8090/GameZone/register.jsp");
      

      Assert.assertEquals(webDriver.getTitle(), "Register");
      System.out.println("Title : " + webDriver.getTitle());
  }

  @BeforeTest
  public void beforeTest() {
      String chromeDriverDir = "/Users/thariq/Desktop/Tool/chromedriver-mac-x64/chromedriver-mac-x64/chromedriver";
      System.setProperty("webdriver.chrome.driver", chromeDriverDir);
      webDriver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
      webDriver.close();
  }
}