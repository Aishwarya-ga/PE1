/*Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
* a. Add all the even numbers and check whether the sum is more than 25.
* b. Print success and failure messages for all 3 conditions
* Input : 2468642
* Output : 2468642 is palindrome and the sum of even numbers is greater than 25
* Input: 12345
*Output: 12345 is not palindrome
*Input: 12345654321
*Output : 12345654321 is palindrome and sum of even numbers is less than 25*/
package com.stackroute.pe1;

public class PalindromeCheck {
     /*
     method to check for palindrome
      */
     public String palindrome_1(long num) {
         long digit;
         long rev = 0;
         long sum = 0;
         long temp;
         temp = num;
         //digits are being reversed
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
         }
        else {
            return "not a Palidrome";
        }
     }
}


