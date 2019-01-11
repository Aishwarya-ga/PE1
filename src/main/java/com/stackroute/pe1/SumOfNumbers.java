/*Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together. The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
*        Input :  12 23 2 4
*        Output : 41*/
package com.stackroute.pe1;

public class SumOfNumbers {
    /*
    method to sum the numbers entered
     */
    public int sumOfNumber(String string){
            //splitting the string
            String [] input = string.split(" ");
            int sum = 0;
            int i=0;
            while (i<input.length) {
                //converting string to integer and adding
                sum +=Integer.parseInt(input[i]);
                i++;
            }
            return sum;
    }
}
