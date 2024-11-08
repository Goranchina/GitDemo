import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Miscellaneous {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/goran/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com");
        driver.findElement(By.xpath("id('email')")).sendKeys("fsfd");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        int a = 5;
        getScreenshot(driver);

        //driver.manage().deleteCookiesNamed("sessionKey");


    }

    public static void getScreenshot(WebDriver driver) throws IOException {

        driver.get("http://google.com");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src, new File("C:/Users/goran/Pictures"));
    }
}
