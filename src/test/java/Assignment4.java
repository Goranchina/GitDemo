import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/goran/Documents/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windows = driver.getWindowHandles(); //[parentid, childid]
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.className("example")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}

/*
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://the-internet.herokuapp.com/");
driver.findElement(By.linkText("Multiple Windows")).click();
driver.findElement(By.cssSelector("a[href*='windows']")).click();

Set<String> abc=driver.getWindowHandles();
Iterator<String> it=abc.iterator();
String parentWindow=it.next();
driver.switchTo().window(it.next());
System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
driver.switchTo().window(parentWindow);
System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

    }
}
 */