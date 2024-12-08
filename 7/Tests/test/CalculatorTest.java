import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest
{
    @Test
    void addTest()
    {
        assertEquals(14.3, Calculator.add(9, 5.3));
        assertNotEquals(21, Calculator.add(10, 9));
    }

    @Test
    void testSub()
    {
        assertEquals(0, Calculator.subtract(5.7, 5.7));
        assertNotEquals(5, Calculator.subtract(5, 938477.235));
    }

    @Test
    void testMult()
    {
        assertEquals(0, Calculator.multiply(3209845.34, 0));
        assertNotEquals(12, Calculator.multiply(1023984, 9.1392837));
    }

    @Test
    void testDiv()
    {
        assertEquals(3, Calculator.divide(27, 9));
        assertNotEquals(69, Calculator.divide(51, 3));
    }

    @Test
    void testDivByZero()
    {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(958, 0));
    }
}