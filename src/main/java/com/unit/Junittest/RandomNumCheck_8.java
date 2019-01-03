package com.unit.Junittest;

import java.util.Random;
import java.util.Scanner;

public class RandomNumCheck_8 {
    public String checkNumber(int check){
        Random random = new Random();
        int rand_int;
        rand_int = random.nextInt(50);
        rand_int = 29;
//        Sys
        /*checking for conditions*/
        if(check < rand_int && check > -1){
            return "Number guessed is lesser";
        }
        if(check > rand_int){
            return "Number guessed is greater";
        }
        if(check == rand_int){
            return "Number guessed is correct";
        }
        return "null";

    }

}
