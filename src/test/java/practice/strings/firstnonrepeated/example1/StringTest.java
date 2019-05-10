package practice.strings.firstnonrepeated.example1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTest {
  @Test
  public void test1() {
    StringUtil su = new StringUtil();
    char result = su.firstNonRepeatedChar("geeksforgeeks");
    Assert.assertEquals(result,'f', "test failed");
  }

    @Test
    public void test2() {
        StringUtil su = new StringUtil();
        char result = su.firstNonRepeatedChar("geeksforgeeksf");
        Assert.assertEquals(result,'o', "test failed");
    }

    @Test
    public void test3() {
        StringUtil su = new StringUtil();
        char result = su.firstNonRepeatedChar("geeksforgeeksfor");
        Assert.assertEquals(result,'\u0000', "test failed");
    }
}
