package pages;

import Generics.PageObject;
import Locators.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by mcordero1 on 10/30/18.
 */
public class EbayItem extends PageObject{

  @FindBy(xpath = locators.firstElementView_xpath)
  public WebElement itemView;

  @FindBy(id = locators.firstElementPrice_id)
  public WebElement price;

  public EbayItem(WebDriver driver) {
    super(driver);
  }

  public String getPrice() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("prcIsum")));
    return price.getText();
  }

  public boolean isItemDisplayed() {
    try {
      return itemView.isDisplayed();
    }catch (Exception e){
      return false;
    }
  }
}
