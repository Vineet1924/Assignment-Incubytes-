import org.junit.*;

public class StringCalculatorTest {
    @Test
    public void test() {
        StringCalculator calculator = new StringCalculator();
        // test case for version - 1
        Assert.assertEquals(0, calculator.add(""));
        Assert.assertEquals(1, calculator.add("1"));
        Assert.assertEquals(6, calculator.add("1,5"));
        // test case for version - 2
        Assert.assertEquals(6, calculator.add("1\n2,3"));
    }
}
