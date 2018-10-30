package pages;

/**
 * Created by mcordero1 on 10/27/18.
 */


import Generics.PageObject;
import Locators.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GmailLogin extends PageObject{

  @FindBy(id = locators.username)
  public  WebElement userId;

  @FindBy(name =locators.password)
  public  WebElement passId;


  @FindBy(xpath =locators.passErrorMessage)
  public  WebElement errorPass;

  @FindBy(xpath = locators.userErrorMessage)
  public  WebElement errorUser;

  public GmailLogin(WebDriver driver) {
    super(driver);
  }


  public boolean isLoaded() {
    try {
      return userId.isDisplayed();
    }catch (Exception e){
      return false;
    }

  }

  public boolean isErrorPassMessageDisplayed() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[2]/div[2]")));
    return errorPass.isDisplayed();
  }

  public boolean isErrorUserMessageDisplayed() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]")));
    return errorUser.isDisplayed();
  }

  public GmailHome login(String user, String password) {
    userId.sendKeys(user + Keys.RETURN);
    passId.sendKeys(password + Keys.RETURN);
    return new GmailHome(driver);
  }


}
