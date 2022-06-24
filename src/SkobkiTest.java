import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SkobkiTest {
    private Skobki number;
    private int[] seriesOfNumbers;

    @Before
    public void init() {
        number = new Skobki();
        seriesOfNumbers = new int[]{1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796};
    }

    @After
    public void destroy() {
        number = null;
        seriesOfNumbers = null;
    }

    @Test
    public void whenPassCorrectValues() throws Exception {
        for (int i = 0; i <= seriesOfNumbers.length - 1; i++) {
            assertThat(seriesOfNumbers[i], is(number.getNumberOfParenthesesPairs(i)));
        }
    }
}


