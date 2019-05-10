package practice.strings.checkdigits;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StringCheckerTest {
    StringChecker s;

    @BeforeTest
    public void beforeTest() {
        s = new StringChecker();
    }

    @Test
    public void test1() {
    boolean result = s.areDigitsOnly("lkdskdfskjd kdsjkdfkjld kdkdafskjld");

    Assert.assertEquals(result, false, "test failed: digits are existing");
    }

    @Test
    public void test2() {
        boolean result = s.areDigitsOnly("lkdskdfskjd 0kdsjkdfkjld kdkdafskjld");

        Assert.assertEquals(result, false, "test failed: digits are existing");
    }

    @Test
    public void test3() {
        boolean result = s.areDigitsOnly("564546566565712 5565465654654");

        Assert.assertEquals(result, false, "test failed: digits are existing");
    }

    @Test
    public void test4() {
        boolean result = s.areDigitsOnly("5645465665657125565465654654");

        Assert.assertEquals(result, true, "test failed: digits are existing");
    }
}
