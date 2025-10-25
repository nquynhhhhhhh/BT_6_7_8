import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Common {
    public static WebDriver driver;

    public static void createDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void loginCRM(){
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(Locators.inputEmail)).clear();
        driver.findElement(By.xpath(Locators.inputPassword)).clear();
        driver.findElement(By.xpath(Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(Locators.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(Locators.buttonLogin)).click();
    }

    public static void closeDriver(){
        driver.quit();
    }
}
