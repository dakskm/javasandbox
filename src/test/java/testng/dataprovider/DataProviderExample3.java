package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample3 {
  @Test
  public void test3() {
    System.out.println("I'm test3");
  }

  @DataProvider(name = "input", parallel = true)
  public Object[][] inputData() {
    return new Object[][]{
            {"a3", "a", "a"},
            {"b3", "b", "b"},
            {"c3", "c", "c"},
            {"d3", "d", "d"},
            {"e3", "e", "e"},
            {"f3", "f", "f"},
            {"g3", "g", "g"},
            {"h3", "h", "h"},
            {"i3", "i", "i"},
            {"j3", "j", "j"},
            {"k3", "k", "k"},
            {"l3", "l", "l"},
            {"m3", "m", "m"},
            {"n3", "n", "n"},
            {"o3", "o", "o"},
            {"p3", "p", "p"},
            {"q3", "q", "q"},
            {"r3", "r", "r"},
            {"s3", "s", "s"}
    };
  }
}
