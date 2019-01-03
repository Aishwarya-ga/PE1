package com.unit.Junittest;

public class CheckEvenOdd_2 {
    String checkEvenOdd(int number) {
        /*condition for checking a number is even*/
        if (number % 2 == 0) {
            if (number >= 20 && number <= 30) {
                return "jerry";
            }
//          else {
//                return " number is even but lesser than 20";
//          }
        }
        else {
            if (number >= 20 && number <= 30) {
                return "tom";
            }
//            else {
//                return "number is odd and lesser than 20 ";
//          }
        }
        return "not a valid input";
    }

}
