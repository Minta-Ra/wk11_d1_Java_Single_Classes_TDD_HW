import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.add(2, 6));
    }

    @Test
    public void canSubtract(){
        assertEquals(17, calculator.subtract(32, 15));
    }

    @Test
    public void canMultiply(){
        assertEquals(72, calculator.multiply(12, 6));
    }

    @Test
    public void canDivide(){
        assertEquals(48.2, calculator.divide(120.5, 2.5), 0.0);
    }
}
