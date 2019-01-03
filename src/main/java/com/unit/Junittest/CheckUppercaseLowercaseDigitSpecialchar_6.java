package com.unit.Junittest;

import static java.lang.Character.*;

public class CheckUppercaseLowercaseDigitSpecialchar_6 {
    public String checkInput(String character){

        char ch = character.charAt(0);
        if( isUpperCase(ch)) {
            return "capital letter";
        }
        /*checking for lowercase*/
        else  if( isLowerCase(ch)){
            return "small letter";

        }
        /*checking for digit*/
        else if(isDigit(ch)){
            return "Digit";
        }
        /*if not uppercase,lowercase,digit then special character*/
        else{
            return "Special character";
        }

    }

}
