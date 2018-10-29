package pages;

/**
 * Created by mcordero1 on 10/27/18.
 */


import Generics.PageObject;
import org.openqa.selenium.WebDriver;

public class GmailLogin extends PageObject{

  public GmailLogin(WebDriver driver) {
    super(driver);
  }


  public static boolean isLoaded() {
    return false;
  }

  public GmailHome login(String user, String password) {
    return new GmailHome(driver);
  }
}
