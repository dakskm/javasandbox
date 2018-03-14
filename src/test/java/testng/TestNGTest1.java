package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGTest1 {
    @Test
    public void testAdd() {
        String str = "TestNG";

        assertEquals("TestNG", str);
    }
}
