package pages;

import Generics.PageObject;
import Locators.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by mcordero1 on 10/30/18.
 */
public class EbayHome extends PageObject{

  @FindBy(id = locators.ebayLogo_id)
  public WebElement ebayLogo;

  @FindBy(id = locators.serachBox_id)
  public WebElement searchBox;

  public EbayHome(WebDriver driver) {
    super (driver);
  }

  public boolean isLoaded() {
    try {
      return ebayLogo.isDisplayed();
    }catch (Exception e){
      return false;
    }
  }

  public EbayResults search(String item) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
    searchBox.sendKeys(item + Keys.RETURN);
    return new EbayResults (driver);
  }
}
