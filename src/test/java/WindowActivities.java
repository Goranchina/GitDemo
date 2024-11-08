import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/goran/Documents/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");//components are loaded
        driver.navigate().to("https://rahulshettyacademy.com");//continues with basic image
        driver.navigate().back();//clicks native back browser button
        driver.navigate().forward(); //clicks forward browser button



    }
}
