package pages;

import Generics.PageObject;
import org.openqa.selenium.WebDriver;

/**
 * Created by mcordero1 on 10/27/18.
 */
public class GmailHome extends PageObject {

  public GmailHome(WebDriver driver){
    super(driver);
  }

  public static boolean isUserLogged() {
    return false;
  }
}
