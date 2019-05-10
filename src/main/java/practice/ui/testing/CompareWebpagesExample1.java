package practice.ui.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CompareWebpagesExample1 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new SafariDriver();

        driver.get("https://www.apple.com");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        Screenshot ss = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);

        File dir = new File("/users/dakshin/desktop");
        File serializedFile = null;

        serializedFile = new File(dir, "test1.png");

        try {
            ImageIO.write(ss.getImage(), "PNG", serializedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.close();
        driver.quit();
    }
}
