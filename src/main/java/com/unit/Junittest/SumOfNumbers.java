package com.unit.Junittest;

import java.util.Scanner;

public class SumOfNumbers {
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
