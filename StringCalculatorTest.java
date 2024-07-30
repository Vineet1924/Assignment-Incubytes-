import org.junit.*;

public class StringCalculatorTest {
    @Test
    public void test() {
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(0, calculator.add(""));
        Assert.assertEquals(1, calculator.add("1"));
        Assert.assertEquals(6, calculator.add("1,5"));
    }
}
