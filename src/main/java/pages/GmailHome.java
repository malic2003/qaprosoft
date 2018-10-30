package pages;

import Generics.PageObject;
import Locators.locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mcordero1 on 10/27/18.
 */
public class GmailHome extends PageObject {

  @FindBy(xpath = locators.logo)
  public WebElement logo;

  public GmailHome(WebDriver driver){
    super(driver);
  }

  public boolean isUserLogged() {
    return logo.isDisplayed();
  }
}
