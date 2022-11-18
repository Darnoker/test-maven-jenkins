import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        int expectedResult = 4;

        Assert.assertEquals(expectedResult, result);
    }

}