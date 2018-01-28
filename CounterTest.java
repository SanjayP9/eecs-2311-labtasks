
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CounterTest {

    private Counter c;

    @Before
    public void setUp() throws Exception {
        c = new Counter();
    }

    @Test
    public void testIncrement() {
        assertEquals(1,c.increment());
        assertEquals(2,c.increment());
    }

    @Test
    public void testDecrement() {
        assertEquals(-1,c.decrement());
        assertEquals(-2,c.decrement());
    }

}