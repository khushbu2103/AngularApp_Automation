package AngularApp_Pages;

import AngularApp_Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "//a[@href = '/login']")
    WebElement signIn;
    @FindBy(xpath = "//a[@ng-reflect-router-link='/article,Ill-quantify-the-redu']//h1[1]")
    WebElement post;
    @FindBy(xpath = "//a[@routerlink = '/editor']")
    WebElement newArticle;

    @FindBy(xpath = "//a[@routerlink='/settings']")
    WebElement settings;

    @FindBy(xpath = "//button[text()=' 0 ']")
    WebElement likeButton;

    @FindBy(xpath = "(//a[@href='/profile/khushi%20soni'])[2]")
    WebElement userName;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }
    public SignInPage login() throws InterruptedException {
        signIn.click();
        Thread.sleep(3000);
        return new SignInPage();
    }

    public void openPost()
    {
        post.click();
    }
    public NewArticlePage newArticleTab()
    {
        newArticle.click();
        return new NewArticlePage();
    }
    public SettingsPage settingsTab()
    {
        settings.click();
        return new SettingsPage();
    }
    public void likeButtonOption()
    {
        likeButton.click();
    }
    public ViewArticlePage oneArticle()
    {
        userName.click();
        return new ViewArticlePage();
    }
}
