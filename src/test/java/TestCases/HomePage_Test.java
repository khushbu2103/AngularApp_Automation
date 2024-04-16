package TestCases;

import AngularApp_Base.TestBase;
import AngularApp_Pages.HomePage;
import AngularApp_Pages.SignInPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage_Test extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    @BeforeMethod
    public void setUp1() throws InterruptedException {
        initialization();
        homePage = new HomePage();
        signInPage = homePage.login();
        homePage = signInPage.loginDetails(prop.getProperty("emailId"), prop.getProperty("password"));

    }
    @Test
    public void homePage() {

        homePage.openPost();
    }
    @Test
    public void newArticle() throws InterruptedException {
        Thread.sleep(3000);
        homePage.newArticleTab();
    }
    @Test public void likeButton() throws InterruptedException {
        Thread.sleep(3000);
        homePage.likeButtonOption();
    }

}
