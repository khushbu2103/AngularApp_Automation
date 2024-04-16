package AngularApp_Pages;

import AngularApp_Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static AngularApp_Base.TestBase.driver;

public class SignInPage extends TestBase {
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[text()=' Sign in ']")
    WebElement signInButton;
    public SignInPage()
    {
        PageFactory.initElements(driver, this);
    }
    public HomePage loginDetails(String e_Id, String pw) throws InterruptedException {
        email.sendKeys(e_Id);
        password.sendKeys(pw);
        signInButton.click();
        Thread.sleep(3000);
        return new HomePage();
    }
}
