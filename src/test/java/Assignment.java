import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
    public static void main(String[] args) {

        String text = "Goran";
        System.setProperty("webdriver.chrome.driver", "C:/Users/goran/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        System.out.println(driver.switchTo().alert().getText());
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        //one guy
        //second guy
        //third guy

        System.out.println(driver.switchTo().alert().getText());
        System.out.println(driver.switchTo().alert().getText());
        System.out.println(driver.switchTo().alert().getText());
        System.out.println(driver.switchTo().alert().getText());

    }
}
