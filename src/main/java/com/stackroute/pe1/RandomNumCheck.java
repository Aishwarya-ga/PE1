/*Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100) User should guess until the the target number is guessed correctly.
*        Print separate messages for the following:
*        a. Number guessed is more than original number
*        b. Number guessed is less than original number
*        c. Number guessed matches the original number*/
package com.stackroute.pe1;

import java.util.Random;

public class RandomNumCheck {
    /*
    method to check the guessed number
     */
    public String checkNumber(int check){
        Random random = new Random();
        int randInt;
        randInt = random.nextInt(50);
        if(check < randInt && check > -1){
            return "Number guessed is lesser";
        }
        if(check > randInt){
            return "Number guessed is greater";
        }
        if(check == randInt){
            return "Number guessed is correct";
        }
        return "null";
    }
}
