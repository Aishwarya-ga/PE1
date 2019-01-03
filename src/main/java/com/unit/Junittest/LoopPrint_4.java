package com.unit.Junittest;


import java.util.Scanner;

public class LoopPrint_4 {
    String loopPrint(int number){
        String string = "";
    /*loop for printing the number as 122333444455555....etc*/
        for(int i = 1; i <= number; i++){
        for(int j = 1; j <= i; j++){
            string = string + i;
            string = string +"1";
        }
    }
        return string;

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();

        LoopPrint_4 lp = new LoopPrint_4();
        System.out.println(lp.loopPrint(n));
    }

}
