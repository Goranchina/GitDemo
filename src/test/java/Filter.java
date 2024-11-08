import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.driver", "C:/Users/goran/Documents/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
        //1 result
        List<WebElement> filteredList = veggies.stream().filter(veggie -> veggie.getText().contains("Rice")).
                collect(Collectors.toList());
        //1 result
        Assert.assertEquals(veggies.size(), filteredList.size());


    }
}
