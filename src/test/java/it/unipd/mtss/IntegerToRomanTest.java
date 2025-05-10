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

    //Test da 11 a 20 (parziali) 11 14 19 20
    @Test
    public void shouldConvertElevenToXI() {
        String result = IntegerToRoman.convert(11);
        assertEquals("XI", result);
    }

    @Test
    public void shouldConvertFourteenToXIV() {
        String result = IntegerToRoman.convert(14);
        assertEquals("XIV", result);
    }

    @Test
    public void shouldConvertNineteenToXIX() {
        String result = IntegerToRoman.convert(19);
        assertEquals("XIX", result);
    }

    @Test
    public void shouldConvertTwentyToXX() {
        String result = IntegerToRoman.convert(20);
        assertEquals("XX", result);
    }

    //Test da 30 a 50 (parziali) 30 34 39 40 50
    @Test
    public void shouldConvertThirtyToXXX() {
        String result = IntegerToRoman.convert(30);
        assertEquals("XXX", result);
    }

    @Test
    public void shouldConvertThirtyFourToXXXIV() {
        String result = IntegerToRoman.convert(34);
        assertEquals("XXXIV", result);
    }

    @Test
    public void shouldConvertThirtyNineToXXXIX() {
        String result = IntegerToRoman.convert(39);
        assertEquals("XXXIX", result);
    }

    @Test
    public void shouldConvertFortyToXL() {
        String result = IntegerToRoman.convert(40);
        assertEquals("XL", result);
    }

    @Test
    public void shouldConvertFiftyToL() {
        String result = IntegerToRoman.convert(50);
        assertEquals("L", result);
    }

    //Test da 50 a 100 (parziali)
    @Test
    public void shouldConvertFiftyOneToLI() {
        String result = IntegerToRoman.convert(51);
        assertEquals("LI", result);
    }

    @Test
    public void shouldConvertSixtyToLX() {
        String result = IntegerToRoman.convert(60);
        assertEquals("LX", result);
    }

    @Test
    public void shouldConvertSeventySevenToLXXVII() {
        String result = IntegerToRoman.convert(77);
        assertEquals("LXXVII", result);
    }

    @Test
    public void shouldConvertEightyFourToLXXXIV() {
        String result = IntegerToRoman.convert(84);
        assertEquals("LXXXIV", result);
    }

    @Test
    public void shouldConvertNinetyToXC() {
        String result = IntegerToRoman.convert(90);
        assertEquals("XC", result);
    }

    @Test
    public void shouldConvertNinetyNineToXCIX() {
        String result = IntegerToRoman.convert(99);
        assertEquals("XCIX", result);
    }

    @Test
    public void shouldConvertOneHundredToC() {
        String result = IntegerToRoman.convert(100);
        assertEquals("C", result);
    }
}