import goit.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    SumCalculator res;

    @BeforeEach
    public void BeforeEach() {
        res = new SumCalculator();
    }

    @Test
    public void testSumOne() {
        Assertions.assertEquals(1, res.sum(1));
    }

    @Test
    public void testSumThree() {
        Assertions.assertEquals(6, res.sum(3));
    }

    @Test
    public void testSumZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> res.sum(0));
    }
}
