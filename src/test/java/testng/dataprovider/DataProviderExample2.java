package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 {
  @Test(dataProvider = "input")
  public void test1(String s1, String s2, String s3) {

    System.out.println(s1 + " " + s2 + " " + s3);
    try {
      Thread.sleep(13000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
//    Assert.assertEquals(s1, "ram1");
  }

  @Test
  public void test2() {
    System.out.println("I'm test2");
  }

  @DataProvider(name = "input", parallel = true)
  public Object[][] inputData() {
    return new Object[][]{
            {"a2", "a", "a"},
            {"b2", "b", "b"},
            {"c2", "c", "c"},
            {"d2", "d", "d"},
            {"e2", "e", "e"},
            {"f2", "f", "f"},
            {"g2", "g", "g"},
            {"h2", "h", "h"},
            {"i2", "i", "i"},
            {"j2", "j", "j"},
            {"k2", "k", "k"},
            {"l2", "l", "l"},
            {"m2", "m", "m"},
            {"n2", "n", "n"},
            {"o2", "o", "o"},
            {"p2", "p", "p"},
            {"q2", "q", "q"},
            {"r2", "r", "r"},
            {"s2", "s", "s"}
    };
  }
}
