/*Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
*Condition:
* a. Print an error message if the input is not a letter
* b. If the input having more than one letter, print the required output (Vowel or Consonant) for each letter
*   Input : p
*   Output : Consonant
*   Input : ap
*   Output : Vowel Consonant (should it be a - vowel, p - consonant)*/
package com.stackroute.pe1;

public class CheckVowelConsonant {
    /*
    CheckVowelConsonant
     */
    public static String checkVowelConsonant(String input) {
        String string;
        string = input.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            /*condition for checking whether a letter is vowel*/
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "vowel";

            }
            /*condition for checking whether a letter is consonant*/
            else {
                return "consonant";
            }
        }
        return "Invalid input";
    }
}
