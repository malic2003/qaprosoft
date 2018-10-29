package pages;

import Generics.PageObject;
import org.openqa.selenium.WebDriver;

/**
 * Created by mcordero1 on 10/27/18.
 */
public class Browsing extends PageObject {

  public Browsing(WebDriver driver) {
    super(driver);
  }

  public void goTo(String url){
    driver.get(url);
  }

}
