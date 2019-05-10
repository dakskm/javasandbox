package webapplication.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    WebDriver driver;
    String outputDir;

    TestBase() {
        System.setProperty("webdriver.chrome.driver", "/Users/Dakshin/Softwares/selenium/drivers/chromedriver");
        driver = new ChromeDriver();
        outputDir = System.getProperty("user.home");
    }
}
