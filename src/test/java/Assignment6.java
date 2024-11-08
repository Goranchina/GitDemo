import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment6 {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Users/goran/Documents/Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).click();

        String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText(opt);

        driver.findElement(By.id("name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();
        String text = driver.switchTo().alert().getText();

        if (text.contains(opt)) {
            System.out.println("alert message success");
        } else
            System.out.println("Something wrong with execution");
    }
}
