package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mcordero1 on 10/27/18.
 */
public class PageObject {
  protected WebDriver driver;
  protected WebDriverWait wait;

  public PageObject(WebDriver driver){
    this.driver = driver;
    wait = new WebDriverWait(driver, 15);
    PageFactory.initElements(driver, this);
  }
}
