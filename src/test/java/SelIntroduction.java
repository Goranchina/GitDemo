import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

    public static void main(String[] args) {

        //Invoking Browser
        //Chrome - ChromeDriver extends ->Methods close get
        //Firefox - FirefoxDriver ->Methods close get
        //Safari - SafariDriver ->Methods close get
        //WebDriver close get
        // WebDriver methods + class methods

        //chromedriver.exe -> Chrome browser Selenium Manager
        //step to invoke chrome driver

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\goran\\Documents\\Drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //Firefox

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\goran\\Documents\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Microsoft Edge
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\goran\\Documents\\Drivers\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();

        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //driver.quit();


    }
}
