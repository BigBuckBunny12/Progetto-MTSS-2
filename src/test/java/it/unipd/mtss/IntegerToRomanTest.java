////////////////////////////////////////////////////////////////////
// [GABRIELE] [SCAGGIANTE] [2101076]
// [ANDREA] [LONARDI] [2113199]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {
    //Test da 1 a 10
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

    @Test
    public void shouldConvertFourToIV() {
        String result = IntegerToRoman.convert(4);
        assertEquals("IV", result);
    }

    @Test
    public void shouldConvertFiveToV() {
        String result = IntegerToRoman.convert(5);
        assertEquals("V", result);
    }

    @Test
    public void shouldConvertSixToVI() {
        String result = IntegerToRoman.convert(6);
        assertEquals("VI", result);
    }

    @Test
    public void shouldConvertSevenToVII() {
        String result = IntegerToRoman.convert(7);
        assertEquals("VII", result);
    }

    @Test
    public void shouldConvertEightToVIII() {
        String result = IntegerToRoman.convert(8);
        assertEquals("VIII", result);
    }

    @Test
    public void shouldConvertNineToIX() {
        String result = IntegerToRoman.convert(9);
        assertEquals("IX", result);
    }

    @Test
    public void shouldConvertTenToX() {
        String result = IntegerToRoman.convert(10);
        assertEquals("X", result);
    }
}