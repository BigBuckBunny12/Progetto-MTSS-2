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

    private static final Map<Character, String[]> asciiRomanMap = new HashMap<>();

    static {
        asciiRomanMap.put('I', new String[]{
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        });
        asciiRomanMap.put('V', new String[]{
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
        });
        asciiRomanMap.put('X', new String[]{
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
            "  > <  ",
            " / . \\ ",
            "/_/ \\_\\"
        });
    }

    public static String printAsciiArt(String roman) {
        roman = roman.toUpperCase();
        String[] outputLines = new String[6];

        for (int i = 0; i < 6; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < roman.length(); j++) {
                char ch = roman.charAt(j);
                String[] art = asciiRomanMap.getOrDefault(ch, new String[]{
                    "       ",
                    "       ",
                    "       ",
                    "   ?   ",
                    "       ",
                    "       "
                });
                line.append(art[i]);
                if (j != roman.length() - 1) {
                    line.append(" ");
                }
            }
            outputLines[i] = line.toString();
        }

        return String.join("\n", outputLines) + "\n";
    }
}