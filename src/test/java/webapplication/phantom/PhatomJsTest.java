package webapplication.phantom;

import org.testng.annotations.Test;

public class PhatomJsTest {

  @Test
  public void phantomJsTest() {
    System.out.println("starting");

    String phantomJsPath = "src/test/resources/phantomjs-2.1.1-macosx/bin/phantomjs";
    System.setProperty("phantomjs.binary.path", phantomJsPath);

  }
}
