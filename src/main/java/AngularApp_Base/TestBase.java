package AngularApp_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public TestBase()
    {
        try {
            prop=new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\LENOVO\\IdeaProjects\\AngularApp_Automation\\src\\main\\java\\AngularApp_Config\\Config.properties");
            prop.load(ip);
//            System.out.println("URL: " + prop.getProperty("url"));
//            System.out.println("Book Name: " + prop.getProperty("bookName"));
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void initialization()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
}
