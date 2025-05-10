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

    @Test
    public void shouldPrintFour() {
        String expected =
            " _____  __      __\n" +
            "|_   _| \\ \\    / /\n" +
            "  | |    \\ \\  / / \n" +
            "  | |     \\ \\/ /  \n" +
            " _| |_     \\  /   \n" +
            "|_____|     \\/    \n";
        String result = RomanPrinter.print(4);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintFive() {
        String expected =
            "__      __\n" +
            "\\ \\    / /\n" +
            " \\ \\  / / \n" +
            "  \\ \\/ /  \n" +
            "   \\  /   \n" +
            "    \\/    \n";
        String result = RomanPrinter.print(5);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintSix() {
        String expected =
            "__      __  _____ \n" +
            "\\ \\    / / |_   _|\n" +
            " \\ \\  / /    | |  \n" +
            "  \\ \\/ /     | |  \n" +
            "   \\  /     _| |_ \n" +
            "    \\/     |_____|\n";
        String result = RomanPrinter.print(6);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintSeven() {
        String expected =
            "__      __  _____   _____ \n" +
            "\\ \\    / / |_   _| |_   _|\n" +
            " \\ \\  / /    | |     | |  \n" +
            "  \\ \\/ /     | |     | |  \n" +
            "   \\  /     _| |_   _| |_ \n" +
            "    \\/     |_____| |_____|\n";
        String result = RomanPrinter.print(7);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintEight() {
        String expected =
            "__      __  _____   _____   _____ \n" +
            "\\ \\    / / |_   _| |_   _| |_   _|\n" +
            " \\ \\  / /    | |     | |     | |  \n" +
            "  \\ \\/ /     | |     | |     | |  \n" +
            "   \\  /     _| |_   _| |_   _| |_ \n" +
            "    \\/     |_____| |_____| |_____|\n";
        String result = RomanPrinter.print(8);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintNine() {
        String expected =
            " _____  __   __\n" +
            "|_   _| \\ \\ / /\n" +
            "  | |    \\ V / \n" +
            "  | |     > <  \n" +
            " _| |_   / . \\ \n" +
            "|_____| /_/ \\_\\\n";
        String result = RomanPrinter.print(9);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintTen() {
        String expected =
            "__   __\n" +
            "\\ \\ / /\n" +
            " \\ V / \n" +
            "  > <  \n" +
            " / . \\ \n" +
            "/_/ \\_\\\n";
        String result = RomanPrinter.print(10);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintEleven() {
        String expected =
            "__   __  _____ \n" +
            "\\ \\ / / |_   _|\n" +
            " \\ V /    | |  \n" +
            "  > <     | |  \n" +
            " / . \\   _| |_ \n" +
            "/_/ \\_\\ |_____|\n";
        String result = RomanPrinter.print(11);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintFourteen() {
        String expected =
            "__   __  _____  __      __\n" +
            "\\ \\ / / |_   _| \\ \\    / /\n" +
            " \\ V /    | |    \\ \\  / / \n" +
            "  > <     | |     \\ \\/ /  \n" +
            " / . \\   _| |_     \\  /   \n" +
            "/_/ \\_\\ |_____|     \\/    \n";
        String result = RomanPrinter.print(14);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintNineteen() {
        String expected =
            "__   __  _____  __   __\n" +
            "\\ \\ / / |_   _| \\ \\ / /\n" +
            " \\ V /    | |    \\ V / \n" +
            "  > <     | |     > <  \n" +
            " / . \\   _| |_   / . \\ \n" +
            "/_/ \\_\\ |_____| /_/ \\_\\\n";
        String result = RomanPrinter.print(19);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintTwenty() {
        String expected =
            "__   __ __   __\n" +
            "\\ \\ / / \\ \\ / /\n" +
            " \\ V /   \\ V / \n" +
            "  > <     > <  \n" +
            " / . \\   / . \\ \n" +
            "/_/ \\_\\ /_/ \\_\\\n";
        String result = RomanPrinter.print(20);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintThirty() {
        String expected =
            "__   __ __   __ __   __\n" +
            "\\ \\ / / \\ \\ / / \\ \\ / /\n" +
            " \\ V /   \\ V /   \\ V / \n" +
            "  > <     > <     > <  \n" +
            " / . \\   / . \\   / . \\ \n" +
            "/_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n";
        String result = RomanPrinter.print(30);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintForty() {
        String expected =
            "__   __   _      \n" +
            "\\ \\ / /  | |     \n" +
            " \\ V /   | |     \n" +
            "  > <    | |     \n" +
            " / . \\   | |____ \n" +
            "/_/ \\_\\  |______|\n";
        String result = RomanPrinter.print(40);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintFifty() {
        String expected =
            " _      \n" +
            "| |     \n" +
            "| |     \n" +
            "| |     \n" +
            "| |____ \n" +
            "|______|\n";
        String result = RomanPrinter.print(50);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintEighty() {
        String expected =
            " _       __   __ __   __ __   __\n" +
            "| |      \\ \\ / / \\ \\ / / \\ \\ / /\n" +
            "| |       \\ V /   \\ V /   \\ V / \n" +
            "| |        > <     > <     > <  \n" +
            "| |____   / . \\   / . \\   / . \\ \n" +
            "|______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n";
        String result = RomanPrinter.print(80);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintNinety() {
        String expected =
            "__   __    _____ \n" +
            "\\ \\ / /  / ____|\n" +
            " \\ V /  | |     \n" +
            "  > <   | |     \n" +
            " / . \\  | |____ \n" +
            "/_/ \\_\\  \\_____|\n";
        String result = RomanPrinter.print(90);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintOneHundred() {
        String expected =
            "  _____ \n" +
            " / ____|\n" +
            "| |     \n" +
            "| |     \n" +
            "| |____ \n" +
            " \\_____|\n";
        String result = RomanPrinter.print(100);
        assertEquals(expected, result);
    }
}