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
    Assert.assertTrue(GmailLogin.isLoaded());
    GmailHome homepage = mail.login(user,password);
    Assert.assertTrue(GmailHome.isUserLogged());
  }
}
