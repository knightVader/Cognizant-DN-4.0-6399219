import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: Setup test fixture
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        // Teardown: Clean up after test
        calculator = null;
    }

    @Test
    public void testAdd() {
        // Arrange is done in setUp()
        // Act
        int result = calculator.add(2, 2);
        // Assert
        assertEquals(4, result);
    }

    @Test
    public void testSubtract() {
        // Act
        int result = calculator.subtract(6, 2);
        // Assert
        assertEquals(4, result);
    }

    @Test
    public void testMultiply() {
        // Act
        int result = calculator.multiply(2, 3);
        // Assert
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        // Act
        double result = calculator.divide(10, 2);
        // Assert
        assertEquals(5.0, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        // Act & Assert
        calculator.divide(4, 0);
    }
}
