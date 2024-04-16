package AngularApp_Pages;

import AngularApp_Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static AngularApp_Base.TestBase.driver;

public class SettingsPage extends TestBase {
    @FindBy(xpath = "//input[@formcontrolname='username']")
    WebElement userName;

    @FindBy(xpath = "//textarea[@formcontrolname='bio']")
    WebElement bio;

    @FindBy(xpath = "//button[text()=' Update Settings ']")
    WebElement updateButton;

    public SettingsPage()
    {
        PageFactory.initElements(driver, this);
    }
    public void updateProfile()
    {
        userName.sendKeys("khushi soni");
        bio.sendKeys("Automation Engineer");
        updateButton.click();
    }
}
