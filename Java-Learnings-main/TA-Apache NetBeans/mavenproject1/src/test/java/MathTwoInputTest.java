

import com.mycompany.mavenproject1.MathTwoInput;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathTwoInputTest {

    @Test
    public void testFindLCM_validSmallNumbers() {
        assertEquals(12, MathTwoInput.findLCM("4", "6"));
    }

    @Test
    public void testFindLCM_oneIsMultipleOfOther() {
        assertEquals(15, MathTwoInput.findLCM("5", "15"));
    }

    

}
