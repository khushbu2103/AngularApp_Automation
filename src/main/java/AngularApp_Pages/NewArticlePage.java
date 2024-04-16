package AngularApp_Pages;

import AngularApp_Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static AngularApp_Base.TestBase.driver;

public class NewArticlePage extends TestBase {
    @FindBy(xpath = "//input[@placeholder = 'Article Title']")
    WebElement articleTitle;
    @FindBy(xpath = "//input[@formcontrolname='description']")
    WebElement articleAbout;
    @FindBy(xpath = "//textarea[@placeholder='Write your article (in markdown)']")
    WebElement yourArticle;
    @FindBy(xpath = "//button[text()=' Publish Article ']")
    WebElement publishButton;
    public NewArticlePage()
    {
        PageFactory.initElements(driver, this);
    }
    public void newArticlePage()
    {
        articleTitle.sendKeys("Faith");
        articleAbout.sendKeys("Faith on God");
        yourArticle.sendKeys("Having faith is having trust. You have to trust with your entire being that God has your back that he will help you and take care of you. He knows what is best, but to truly embrace what he has planned for you, you have to fully trust. Our trust is not foolish, for our God is both faithful and good.");
        publishButton.click();
    }

}
