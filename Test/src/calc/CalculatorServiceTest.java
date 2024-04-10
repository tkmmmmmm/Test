package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    
    private Calculator calulator;
    private CalculatorService service;

    @BeforeEach
    public void setUp() {
        calulator = new Calculator();
        service = new CalculatorService(calulator);
    }

    @Test
    public void testAddAndReport() {
        assertEquals("Result: 5", service.addAndReport(2, 3));
    }

    @Test
    public void testSubtractAndReport() {
        assertEquals("Result: 1", service.subtractAndReport(3, 2));
    }

}
