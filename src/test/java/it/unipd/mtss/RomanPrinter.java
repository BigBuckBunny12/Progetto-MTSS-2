////////////////////////////////////////////////////////////////////
// [GABRIELE] [SCAGGIANTE] [2101076]
// [ANDREA] [LONARDI] [2113199]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class RomanPrinter {
  public static String print(int num){
    return printAsciiArt(IntegerToRoman.convert(num));
  }
  private static String printAsciiArt(String romanNumber){

    String[] ascii = {
        " __ ",
        "|   |",
        "  | |  ",
        "  | |  ",
        " | | ",
        "|__|"
    };

    StringBuilder[] lines = new StringBuilder[ascii.length];
    for (int i = 0; i < lines.length; i++) {
        lines[i] = new StringBuilder();
    }

    for (int i = 0; i < romanNumber.length(); i++) {
        char c = romanNumber.charAt(i);
        if (c == 'I') {
            for (int j = 0; j < ascii.length; j++) {
                lines[j].append(ascii[j]).append(" ");
            }
        }
    }

    StringBuilder finalArt = new StringBuilder();
    for (StringBuilder line : lines) {
        finalArt.append(line.toString().trim()).append("\n");
    }

    return finalArt.toString();
  }
}