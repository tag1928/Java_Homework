import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class FaxTest
{
    @Timeout(1)
    @Test
    void factorialTest()
    {
        assertEquals(120, Fax.factorial(5));
        assertEquals(6, Fax.factorial(3));
    }

    @Test
    void factorialTestZero()
    {
        assertEquals(1, Fax.factorial(0));
    }

    @Test
    void factorialTestNegativeInput()
    {
        assertThrows(IllegalArgumentException.class, () -> Fax.factorial(-123424));
    }
}