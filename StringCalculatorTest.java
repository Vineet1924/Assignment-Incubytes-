import org.junit.*;

public class StringCalculatorTest {
    @Test
    public void test() {
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(0, calculator.add(""));
    }
}
