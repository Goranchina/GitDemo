import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Assignment7 {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.driver", "C:/Users/goran/Documents/chromedriver-win32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> rowsCount = driver.findElements(By.cssSelector(".table-display tr"));

        List<WebElement> columnCount = driver.findElements(By.cssSelector(".table-display th"));

        System.out.println(rowsCount.size());
        System.out.println(columnCount.size());

        System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(1)")).getText());
        System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(2)")).getText());
        System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(3)")).getText());


//        WebElement table = driver.findElement(By.id("product"));
//
//        System.out.println(table.findElements(By.tagName("tr")).size());
//
//        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//        List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//        System.out.println(secondrow.get(0).getText());
//
//        System.out.println(secondrow.get(1).getText());
//
//        System.out.println(secondrow.get(2).getText());
    }
}
