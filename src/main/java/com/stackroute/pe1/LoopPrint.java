/*Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
        Input: 5
        Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5*/
package com.stackroute.pe1;

public class LoopPrint {
    /*
    method to print series of numbers
     */
    public String loopPrint(int number) {
        if (number == 0) {
            String string = "";
            /*loop for printing the number as 122333444455555....etc*/
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    string = string + i;
                    string = string + "1";
                }
            }
            return string;
        }
        return null;
    }
}
