////////////////////////////////////////////////////////////////////
// [GABRIELE] [SCAGGIANTE] [2101076]
// [ANDREA] [LONARDI] [2113199]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number) {
    if (number < 1 || number > 1000) {
        throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
    }

    // Definizione delle lettere romane e dei loro valori corrispondenti
    String[] romanLetters = {"X", "IX", "V", "IV", "I"};
    int[] values = {10, 9, 5, 4, 1};

    StringBuilder romanNumber = new StringBuilder();

    // Itera attraverso i valori romani e aggiungi le lettere corrispondenti
    for (int i = 0; i < values.length; i++) {
        while (number >= values[i]) {
            number -= values[i];
            romanNumber.append(romanLetters[i]);
        }
    }

    return romanNumber.toString();
}
