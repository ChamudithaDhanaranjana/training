import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    public void testSquare() {
        assertEquals(25, MathUtils.square(5));
        assertEquals(144, MathUtils.square(12));
        assertEquals(0, MathUtils.square(0));
        assertEquals(1, MathUtils.square(-1));
    }
}
