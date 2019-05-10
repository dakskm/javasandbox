package testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {

  DataProviderExample1() {
  }

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
    System.out.println("I'm test1");
  }

  @DataProvider(name = "input", parallel = true)
  public Object[][] inputData() {
    return new Object[][]{
            {"a1", "a", "a"},
            {"b1", "b", "b"},
            {"c1", "c", "c"},
            {"d1", "d", "d"},
            {"e1", "e", "e"},
            {"f1", "f", "f"},
            {"g1", "g", "g"},
            {"h1", "h", "h"},
            {"i1", "i", "i"},
            {"j1", "j", "j"},
            {"k1", "k", "k"},
            {"l1", "l", "l"},
            {"m1", "m", "m"},
            {"n1", "n", "n"},
            {"o1", "o", "o"},
            {"p1", "p", "p"},
            {"q1", "q", "q"},
            {"r1", "r", "r"},
            {"s1", "s", "s"}
    };
  }
}
