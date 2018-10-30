package AutomatedScripts;

import Generics.BrowserConfig;
import Generics.PageObject;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Browsing;
import pages.EbayHome;
import pages.EbayItem;
import pages.EbayResults;
import pages.GmailHome;
import pages.GmailLogin;

/**
 * Created by mcordero1 on 10/30/18.
 */
public class EbayTest extends BrowserConfig{

  @Test(testName = "ebayTest")
  @Parameters({"item", "url"})
  public void ebayTest(String item, String url) {
    Browsing browser = new Browsing(driver);
    browser.goTo(url);
    EbayHome ebay = new EbayHome(driver);
    Assert.assertTrue(ebay.isLoaded());
    EbayResults results = ebay.search(item);
    Assert.assertTrue(results.areResultsDisplayed());
    EbayItem element = results.getFirstElement();
    Assert.assertTrue(element.isItemDisplayed());
    System.out.print(element.getPrice());
  }

}
