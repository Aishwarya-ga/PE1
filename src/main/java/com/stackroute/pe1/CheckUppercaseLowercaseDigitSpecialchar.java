/*Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
 *       Input:  A
 *      Output:  Capital letter*/
package com.stackroute.pe1;

import static java.lang.Character.*;

public class CheckUppercaseLowercaseDigitSpecialchar {
    /*
    method to checkUpperCaseLowerCaseDigitSpecialcharacter
     */
    public String checkInput(String string){
        char character = string.charAt(0);
        //condition to check for upperCase
        if( isUpperCase(character)) {
            return "capital letter";
        }
        //checking for lowercase
        else  if( isLowerCase(character)){
            return "small letter";
        }
        //checking for digit
        else if(isDigit(character)){
            return "Digit";
        }
        //if not uppercase,lowercase,digit then special character
        else{
            return "Special character";
        }
    }
}
