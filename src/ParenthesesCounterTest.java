import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ParenthesesCounterTest {
    private ParenthesesCounter number;
    private int[] seriesOfNumbers;

    @Before
    public void seriesNums() {
        number = new ParenthesesCounter();

        // Catalan numbers from 0 to 10
        seriesOfNumbers = new int[]{1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796};
    }

    @After
    public void destroy() {
        number = null;
        seriesOfNumbers = null;
    }

    @Test
    public void ifValueCorrect() throws Exception {
        for (int i = 0; i <= seriesOfNumbers.length - 1; i++) {
            //comparing results, one by one
            assertThat(seriesOfNumbers[i], is(number.getNumberOfParenthesesPairs(i)));
        }
    }
}


