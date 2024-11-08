import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/goran/Documents/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //        //a[@value='MAA'] - Xpath for chennai

        //        //a[@value='BLR'] - Xpath for bengaluru

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        // .ui-state-default.ui-state-highlight
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();


        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("it's enabled");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }


    }
}
