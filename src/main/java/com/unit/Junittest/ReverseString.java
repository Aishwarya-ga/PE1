package com.unit.Junittest;

public class ReverseString {
    public String reverse(String string){
        int length = string.length();

        String reverse = "";

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        return reverse;
    }

}
