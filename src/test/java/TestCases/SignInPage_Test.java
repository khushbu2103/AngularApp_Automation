package TestCases;

import AngularApp_Base.TestBase;
import AngularApp_Pages.HomePage;
import AngularApp_Pages.SignInPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPage_Test extends TestBase {
    SignInPage signInPage;
    HomePage homePage;
    @BeforeMethod
    public void setUp1() throws InterruptedException {
        initialization();
        homePage = new HomePage();
        signInPage = homePage.login();
    }
    @Test
    public void signPage() throws InterruptedException {
        Thread.sleep(3000);
        signInPage.loginDetails(prop.getProperty("emailId"), prop.getProperty("password"));
    }
}
