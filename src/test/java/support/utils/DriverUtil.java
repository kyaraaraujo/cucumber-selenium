package support.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverUtil {

    public WebDriver driver;

    public DriverUtil(){
    }

    public WebDriver setupChromeDriverWithWaiting(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        return driver;
    }
}
