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
      
      // Fill in the registration form
      //webDriver.findElement(By.name("Name")).sendKeys("test");
      //webDriver.findElement(By.name("password")).sendKeys("test");
      //webDriver.findElement(By.name("email")).sendKeys("test@test.com");
      //webDriver.findElement(By.name("contact")).sendKeys("12345678");
      //webDriver.findElement(By.name("dob")).sendKeys("11/11/2011");
      
      // Select English from the language dropdown
      //WebElement languageDropdown = webDriver.findElement(By.name("language"));
      //languageDropdown.findElement(By.xpath("//option[. = 'English']")).click();
      
      // Click the register button
      //webDriver.findElement(By.name("register")).click();
      
      // Verify that the page has navigated to the RegisterServlet
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