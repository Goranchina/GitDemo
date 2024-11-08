import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment8 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.firefox.driver", "C:/Users/goran/Documents/chromedriver-win32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement element = driver.findElement(By.id("autocomplete"));
        element.sendKeys("ind");
        element.sendKeys(Keys.DOWN);
        element.sendKeys(Keys.DOWN);
        element.sendKeys(Keys.DOWN);

        System.out.println(element.getAttribute("value"));
        

    }
}
