import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UI {

    public static void main(String[] args ) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/goran/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Goran");
        driver.findElement(By.name("email")).sendKeys("someemail@test.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("SomePass");
        driver.findElement(By.className("form-check-input")).click();
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(0);
        driver.findElement(By.name("inlineRadioOptions")).click();
        driver.findElement(By.name("bday")).sendKeys("16/Jan/1987");
        driver.findElement(By.className("btn-success")).click();
        System.out.println(driver.findElement(By.className("alert-success")).getText());
    }
}
