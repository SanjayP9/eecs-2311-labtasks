
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Random;

import static org.junit.Assert.assertEquals;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({CounterTest.class})
public class AllTests {

    Counter testCounter;
    int currentCount;
    Random rand;

    @Before
    public void start() {
        testCounter = new Counter();
        currentCount = 0;
        rand = new Random();
    }


    @Test
    public void testInc1() {
        // tests basic increment method
        this.currentCount = rand.nextInt(100);
        int temp = 0;


        for (int i = 0; i < this.currentCount; i++) {
            temp = this.testCounter.increment();
        }

        assertEquals(this.currentCount, temp);
    }


    @Test
    public void testInc2() {
        // tests overloaded increment method
        int randVal = 0, result = 0;

        for (int i = 0; i < 100; i++) {
            randVal = rand.nextInt(100);
            this.currentCount += randVal;
            result = this.testCounter.increment(randVal);
        }

        assertEquals(this.currentCount, result);
    }

    @Test
    public void testDec1() {
        // tests basic decrement method
        this.currentCount = rand.nextInt(100);
        int result = 0;


        for (int i = 0; i < this.currentCount; i++) {
            result = this.testCounter.decrement();
        }

        assertEquals(this.currentCount * -1, result);
    }


    @Test
    public void testDec2() {
        // tests overloaded decrement method
        int randVal = 0, result = 0;

        for (int i = 0; i < 100; i++) {
            randVal = rand.nextInt(100);
            this.currentCount -= randVal;
            result = this.testCounter.decrement(randVal);
        }

        assertEquals(this.currentCount, result);
    }


    @Test
    public void testReset() {
        // tests reset method
        int result = 0;

        for (int i = 0; i < 100; i++) {
            result = this.testCounter.increment(rand.nextInt(100));
        }

        this.testCounter.reset();

        assertEquals(0, this.testCounter.getData());
    }

    @Test
    public void testIncDec() {
        // tests both increment and decrement
        boolean isInc = true;
        int randVal = 0, result = 0;

        for (int i = 0; i < 100; i++) {
            isInc = rand.nextBoolean();
            randVal = rand.nextInt(100);

            if (isInc) {
                this.currentCount += randVal;
                result = this.testCounter.increment(randVal);
            } else {
                this.currentCount -= randVal;
                result = this.testCounter.decrement(randVal);
            }
        }

        assertEquals(this.currentCount, result);
    }
}

