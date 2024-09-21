import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Main;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    @Test
    public void testSumWithMultipleNumbers() {
        int result = Main.sum(1, 2, 3, 4, 5);
        assertEquals(15, result, "Sum should be 15");
    }

    @Test
    public void testSumWithSingleNumber() {
        int result = Main.sum(10);
        assertEquals(10, result, "Sum should be 10");
    }

    @Test
    public void testSumWithNoNumbers() {
        int result = Main.sum();
        assertEquals(0, result, "Sum should be 0 when no numbers are provided");
    }

    @Test
    public void testSumWithNegativeNumbers() {
        int result = Main.sum(-1, -2, -3);
        assertEquals(-6, result, "Sum should be -6 for negative numbers");
    }
}
