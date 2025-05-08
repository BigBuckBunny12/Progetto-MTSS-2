////////////////////////////////////////////////////////////////////
// [GABRIELE] [SCAGGIANTE] [2101076]
// [ANDREA] [LONARDI] [2113199]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void shouldConvertOneToI() {
        String result = IntegerToRoman.convert(1);
        assertEquals("I", result);
    }

    @Test
    public void shouldConvertTwoToII() {
        String result = IntegerToRoman.convert(2);
        assertEquals("II", result);
    }

    @Test
    public void shouldConvertThreeToIII() {
        String result = IntegerToRoman.convert(3);
        assertEquals("III", result);
    }
}