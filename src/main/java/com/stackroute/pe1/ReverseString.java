/*Write a program to reverse any string without using String Buffer.
*        Input : london
*        Output : nodnol*/
package com.stackroute.pe1;

public class ReverseString {
    /*
    method to reverse a string
     */
    public String reverse(String string){
        int length = string.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        return reverse;
    }
}
