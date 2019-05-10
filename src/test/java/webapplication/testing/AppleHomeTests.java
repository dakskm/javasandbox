package webapplication.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AppleHomeTests extends TestBase {

    private final File fullpageImage1 = new File(outputDir + "/desktop/fullpageimage1.png");
    private final File fullpageImage2 = new File(outputDir + "/desktop/fullpageimage2.png");
    private final File diffImageFile = new File(outputDir + "/desktop/diffImage.png");
    private final File transparentMarkedImageFile = new File(outputDir + "/desktop/transparentMarkedImage.png");
    private final File markedImageFile = new File(outputDir + "/desktop/markedImage.png");

    Screenshot sc1;
    Screenshot sc2;

    @BeforeClass
    public void setupTest() {

    }

    @AfterClass
    public void quitDriver() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testcase1() throws InterruptedException {
        driver.get("https://www.apple.com/ca/");
        driver.manage().window().maximize();

        sc1 = new AShot().
                shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
        try {
            ImageIO.write(sc1.getImage(), "PNG", fullpageImage1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testcase2() throws InterruptedException {
        driver.get("https://www.apple.com/ca/fr/");
        driver.manage().window().maximize();

        sc2 = new AShot().
                shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
        try {
            ImageIO.write(sc2.getImage(), "PNG", fullpageImage2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testcase3() {
        ImageDiff diff = new ImageDiffer().makeDiff(sc1, sc2);

        BufferedImage diffImage = diff.getDiffImage();
        BufferedImage transparentMarkedImage = diff.getTransparentMarkedImage();
        BufferedImage markedImage = diff.getMarkedImage();

        try {
            ImageIO.write(diffImage, "PNG", diffImageFile);
            ImageIO.write(transparentMarkedImage, "PNG", transparentMarkedImageFile);
            ImageIO.write(markedImage, "PNG", markedImageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
