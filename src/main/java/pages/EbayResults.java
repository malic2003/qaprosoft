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
public class EbayResults extends PageObject {

  @FindBy(id = locators.resultsView_id)
  public WebElement results;

  @FindBy(xpath = locators.firstElement_xpath)
  public WebElement first;

  public EbayResults(WebDriver driver) {
    super(driver);
  }

  public boolean areResultsDisplayed() {
    try {
      return results.isDisplayed();
    }catch (Exception e){
      return false;
    }
  }

  public EbayItem getFirstElement() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"item5465080d9b\"]/h3/a")));
    first.click();
    return new EbayItem(driver);
  }
}
