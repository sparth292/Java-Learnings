

import com.mycompany.mavenproject1.MathFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathFunctionsTest {

    @Test
    public void testPrimeNumber() {
        assertEquals(1, MathFunctions.isPrimeOrComposite("7")); // 7 is prime
    }

    @Test
    public void testCompositeNumber() {
        assertEquals(0, MathFunctions.isPrimeOrComposite("10")); // 10 is composite
    }

    @Test
    public void testNeitherPrimeNorComposite() {
        assertEquals(-1, MathFunctions.isPrimeOrComposite("1")); // 1 is neither
    }

    @Test
    public void testZero() {
        assertEquals(-1, MathFunctions.isPrimeOrComposite("0")); // 0 is neither
    }
}
