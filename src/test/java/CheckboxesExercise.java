import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxesExercise {

    public static void main(String[] args ) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/goran/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.name("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
        driver.findElement(By.name("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

    }
}
