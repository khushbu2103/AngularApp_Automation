package TestCases;

import AngularApp_Base.TestBase;
import AngularApp_Pages.HomePage;
import AngularApp_Pages.NewArticlePage;
import AngularApp_Pages.SignInPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewArticlePage_Test extends TestBase {
    SignInPage signInPage;
    HomePage homePage;
    NewArticlePage newArticle;

    @BeforeMethod
    public void setup1() throws InterruptedException {
        initialization();
        homePage = new HomePage();
        signInPage = homePage.login();
        homePage = signInPage.loginDetails(prop.getProperty("emailId"), prop.getProperty("password"));
        newArticle = homePage.newArticleTab();
    }
    @Test
    public void newArticlePageTest() throws InterruptedException {
        Thread.sleep(3000);
        newArticle.newArticlePage();
    }

}
