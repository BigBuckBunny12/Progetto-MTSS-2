////////////////////////////////////////////////////////////////////
// [GABRIELE] [SCAGGIANTE] [2101076]
// [ANDREA] [LONARDI] [2113199]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {

    @Test
    public void shouldPrintOne() {
        String expected = 
            " _____ \n" +
            "|_   _|\n" +
            "  | |  \n" +
            "  | |  \n" +
            " _| |_ \n" +
            "|_____|\n";
        String result = RomanPrinter.print(1);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintTwo() {
        String expected = 
            " _____   _____ \n" +
            "|_   _| |_   _|\n" +
            "  | |     | |  \n" +
            "  | |     | |  \n" +
            " _| |_   _| |_ \n" +
            "|_____| |_____|\n";
        String result = RomanPrinter.print(2);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintThree() {
        String expected = 
            " _____   _____   _____ \n" +
            "|_   _| |_   _| |_   _|\n" +
            "  | |     | |     | |  \n" +
            "  | |     | |     | |  \n" +
            " _| |_   _| |_   _| |_ \n" +
            "|_____| |_____| |_____|\n";
        String result = RomanPrinter.print(3);
        assertEquals(expected, result);
    }
}