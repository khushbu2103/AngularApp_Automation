package AngularApp_Pages;

import AngularApp_Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.WatchEvent;

public class ViewArticlePage extends TestBase {
    @FindBy(xpath = "//button[@ng-reflect-ng-class='[object Object]'][1]")
    WebElement unfollow;

    public void UnfollowUser()
    {
        unfollow.click();
    }
}
