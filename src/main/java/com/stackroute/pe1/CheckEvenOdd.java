/*Write a program which accepts an integer number as input from the user and perform the following conditional checks:
* a. Print Tom if number is odd and exists between 20 to 30
* b. Print Jerry, if number is even and exists between 20 and 30*/
package com.stackroute.pe1;

public class CheckEvenOdd {
    /*
    method to check even or odd
     */
    String checkEvenOdd(int number) {
        //condition for checking a number is even
        if (number % 2 == 0) {
            if (number >= 20 && number <= 30) {
                return "jerry";
            }
        }
        //condtion for checking a number is odd
        else {
            if (number >= 20 && number <= 30) {
                return "tom";
            }
        }
        return "not a valid input";
    }
}
