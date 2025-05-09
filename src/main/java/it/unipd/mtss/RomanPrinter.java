////////////////////////////////////////////////////////////////////
// [GABRIELE] [SCAGGIANTE] [2101076]
// [ANDREA] [LONARDI] [2113199]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static final Map<Character, String> asciiRomanMap = new HashMap<>();

    static {
        asciiRomanMap.put('I',
            " _____ \n" +
            "|_   _|\n" +
            "  | |  \n" +
            "  | |  \n" +
            " _| |_ \n" +
            "|_____|\n"
        );

        asciiRomanMap.put('V',
            "__      __\n" +
            "\\ \\    / /\n" +
            " \\ \\  / / \n" +
            "  \\ \\/ /  \n" +
            "   \\  /   \n" +
            "    \\/    \n"
        );

        asciiRomanMap.put('X',
            "__   __\n" +
            "\\ \\ / /\n" +
            " \\ V / \n" +
            "  > <  \n" +
            " / . \\ \n" +
            "/_/ \\_\\\n"
        );

        asciiRomanMap.put('L',
            "  _      \n" +
            " | |     \n" +
            " | |     \n" +
            " | |     \n" +
            " | |____ \n" +
            " |______|\n"
        );
    }

    public static String printAsciiArt(String roman) {
        roman = roman.toUpperCase();
        String[] outputLines = new String[6];

        for (int i = 0; i < 6; i++) {
            outputLines[i] = "";
        }

        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            String[] artLines = asciiRomanMap.get(ch).split("\n");
            for (int j = 0; j < 6; j++) {
                outputLines[j] += artLines[j];
                if (i != roman.length() - 1) {
                    outputLines[j] += " ";
                }
            }
        }

        return String.join("\n", outputLines) + "\n";
    }
}
