import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement {
    public static void main(String[] args) {
        Common.createDriver();
        Common.loginCRM();



        Common.closeDriver();
    }
}
