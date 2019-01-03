package com.unit.Junittest;

import java.util.Scanner;

public class CheckVowelConsonant {
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

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        checkVowelConsonant(input);

    }
}
