package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample4 {
  @Test
  public void test2() {
    System.out.println("I'm test4");
  }

  @DataProvider(name = "input", parallel = true)
  public Object[][] inputData() {
    return new Object[][]{
            {"a4", "a", "a"},
            {"b4", "b", "b"},
            {"c4", "c", "c"},
            {"d4", "d", "d"},
            {"e4", "e", "e"},
            {"f4", "f", "f"},
            {"g4", "g", "g"},
            {"h4", "h", "h"},
            {"i4", "i", "i"},
            {"j4", "j", "j"},
            {"k4", "k", "k"},
            {"l4", "l", "l"},
            {"m4", "m", "m"},
            {"n4", "n", "n"},
            {"o4", "o", "o"},
            {"p4", "p", "p"},
            {"q4", "q", "q"},
            {"r4", "r", "r"},
            {"s4", "s", "s"}
    };
  }
}
