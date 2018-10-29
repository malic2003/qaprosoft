package Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

/**
 * Created by mcordero1 on 10/27/18.
 */
public class BrowserConfig {

  protected static WebDriver driver;
  @BeforeClass
  public void setUp() {
    String os = System.getProperty("os.name").toLowerCase();
    if (os.contains("mac")){
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
    }else {
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
    }
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }


  @AfterClass
  public static void tearDown() {
    driver.close();
  }
}