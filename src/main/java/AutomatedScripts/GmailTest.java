package AutomatedScripts;

import Generics.BrowserConfig;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Browsing;
import pages.GmailHome;
import pages.GmailLogin;

/**
 * Created by mcordero1 on 10/27/18.
 */
public class GmailTest extends BrowserConfig{
  @Test(testName = "logToGmail")
  @Parameters({"user", "password", "url"})
  public void logToGmail(String user, String password, String url) {
    Browsing browser = new Browsing(driver);
    browser.goTo(url);
    GmailLogin mail = new GmailLogin(driver);
    Assert.assertTrue(mail.isLoaded());
    GmailHome homepage = mail.login(user,password);
    Assert.assertTrue(homepage.isUserLogged());
  }

  @Test(testName = "wrongPassMessage")
  @Parameters({"user", "url"})
  public void wrongPassMessage(String user, String url) {
    Browsing browser = new Browsing(driver);
    browser.goTo(url);
    GmailLogin mail = new GmailLogin(driver);
    Assert.assertTrue(mail.isLoaded());
    GmailHome homepage = mail.login(user,"error");
    Assert.assertTrue(mail.isErrorPassMessageDisplayed());
  }

  @Test(testName = "invalidUserMessage")
  @Parameters({"url"})
  public void invalidUserMessage(String url) {
    Browsing browser = new Browsing(driver);
    browser.goTo(url);
    GmailLogin mail = new GmailLogin(driver);
    Assert.assertTrue(mail.isLoaded());
    GmailHome homepage = mail.login("invalid","error");
    Assert.assertTrue(mail.isErrorUserMessageDisplayed());
  }

  @Test(testName = "wrongSite")
  public void wrongSite() {
    Browsing browser = new Browsing(driver);
    browser.goTo("http://www.gmai.com");
    GmailLogin mail = new GmailLogin(driver);
    Assert.assertFalse(mail.isLoaded());
  }
}
