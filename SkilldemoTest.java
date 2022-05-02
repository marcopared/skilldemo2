import static org.junit.Assert.*;
import org.junit.*;

public class SkilldemoTest {
    @Test
    public void multiply() {
        assertEquals(6, Skilldemo.multiply(2, 3));
    }
}
