package TestCases;

import AngularApp_Base.TestBase;
import AngularApp_Pages.HomePage;
import AngularApp_Pages.SettingsPage;
import AngularApp_Pages.SignInPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static AngularApp_Base.TestBase.initialization;
import static AngularApp_Base.TestBase.prop;

public class SettingsPage_Test extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    SettingsPage settingsPage;

    @BeforeMethod
    public void setUp1() throws InterruptedException {
        initialization();
        homePage = new HomePage();
        signInPage = homePage.login();
        homePage = signInPage.loginDetails(prop.getProperty("emailId"), prop.getProperty("password"));
        settingsPage = homePage.settingsTab();
    }
    @Test
    public void setSettingsPageTest() throws InterruptedException {
        Thread.sleep(3000);
        settingsPage.updateProfile();
    }
}
