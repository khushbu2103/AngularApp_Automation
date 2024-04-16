package TestCases;

import AngularApp_Base.TestBase;
import AngularApp_Pages.HomePage;
import AngularApp_Pages.NewArticlePage;
import AngularApp_Pages.SignInPage;
import AngularApp_Pages.ViewArticlePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static AngularApp_Base.TestBase.initialization;
import static AngularApp_Base.TestBase.prop;

public class ViewArticlePage_Test extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    ViewArticlePage viewArticlePage;

    @BeforeMethod
    public void setUp1() throws InterruptedException {
        initialization();
        homePage = new HomePage();
        signInPage = homePage.login();
        homePage = signInPage.loginDetails(prop.getProperty("emailId"), prop.getProperty("password"));
        viewArticlePage = homePage.oneArticle();
    }
    @Test
    public void viewArticlePageTest() throws InterruptedException {
        Thread.sleep(3000);
        viewArticlePage.UnfollowUser();
    }
}
