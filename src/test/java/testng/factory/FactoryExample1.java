package testng.factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExample1 {

  private String s1, s2, s3;

  @Factory(dataProvider = "input")
  public FactoryExample1(String s1, String s2, String s3) {
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  @Test()
  public void test1() {
    System.out.println("test1: " + s1 + " " + s2 + " " + s3);
  }

  @Test
  public void test2() {
    System.out.println("test2: " + s1 + " " + s2 + " " + s3);
  }

  @DataProvider(name = "input", parallel = true)
  public static Object[][] inputData() {
    return new Object[][] {
      {"ram1", "ram2", "ram3"},
      {"nandu1", "nandu2", "nandu3"},
      {"sowju1", "sowju2", "sowju3"},
      {"dakshin1", "dakshin2", "dakshin3"}
    };
  }
}
