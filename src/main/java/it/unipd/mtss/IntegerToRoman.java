////////////////////////////////////////////////////////////////////
// [GABRIELE] [SCAGGIANTE] [2101076]
// [ANDREA] [LONARDI] [2113199]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number) {
    
    String[] romanLetters = {"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] values = {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    StringBuilder romanNumber = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
        while (number >= values[i]) {
            number -= values[i];
            romanNumber.append(romanLetters[i]);
        }
    }

    return romanNumber.toString();
    }
}
