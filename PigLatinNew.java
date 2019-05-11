import java.util.Arrays;

public class PigLatinNew {

  static String convert(String word) {
    // Your Code
    Character[] vowels = { 'a', 'e', 'i', 'o', 'u' };
    char[] wordChars = word.toCharArray();

    int firstVowelIndex = -1;
    for (int i = 0; i < wordChars.length; i++) {
      Character currentChar = wordChars[i];
      boolean isVowel = Arrays.asList(vowels).contains(currentChar);
      System.out.println(currentChar + " : " + isVowel);

      if (isVowel) {
        firstVowelIndex = i;
        break;
      }

    }

    if (firstVowelIndex == 0) {
      return word;
    } else if (firstVowelIndex > 0) {
      return word.substring(firstVowelIndex, wordChars.length) + word.substring(0, firstVowelIndex) + "ay";
    } else {
      return word + "ay";
    }
  }

  public static void main(String[] args) {
    System.out.println(convert("art").equals("art"));
    System.out.println(convert("vowel").equals("owelvay"));
    System.out.println(convert("nginx").equals("inxngay"));
    System.out.println(convert("hello").equals("ellohay"));
    System.out.println(convert("Dr").equals("Dray"));
    // System.out.println(convert("art"));
    // System.out.println(convert("vowel"));
    // System.out.println(convert("nginx"));
    // System.out.println(convert("hello"));
    // System.out.println(convert("Dr"));
  }
}
