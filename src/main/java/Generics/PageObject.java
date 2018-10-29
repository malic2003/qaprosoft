package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mcordero1 on 10/27/18.
 */
public class PageObject {
  protected WebDriver driver;

  public PageObject(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
}
