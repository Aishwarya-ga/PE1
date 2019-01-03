package com.unit.Junittest;


public class PalindromeCheck {
     String palindrome_1(long num) {

        long digit;
        long rev = 0;
        long sum = 0;
        long temp;

        temp = num;
        while (num > 0) {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        /*checking for whether a number is palindrome or not*/
        if (temp == rev) {
            while (rev > 0) {
                num = rev % 10;
                if (rev % 2 == 0) {    /*checking for even number and adding up*/
                    sum = sum + num;
                }
                rev = rev / 10;
            }
            if (sum > 25) {
               return  "number is palindrome and sum of even is greater than 25";
            } else {
                return "number is palindrome and sum of even is lesser than 25";
            }
//           return rev;
        }
       else {
//
            return "not a Palidrome";
        }

    }
}


