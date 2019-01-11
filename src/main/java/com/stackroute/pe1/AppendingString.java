/*Write a program for the following condition:
*Given 2 inputs , where input1 is string and input 2 is integer value,
* the last n characters should repeat n number of times in the output
* String.*/
package com.stackroute.pe1;

public class AppendingString {
    /*
    method to append string
     */
    public String append(String string, int number) {
        if (string != null) {
            String subString;
            //takes the substring at the mentioned position
            subString = string.substring(number);
            StringBuffer sb = new StringBuffer(subString);
            for (int i = 0; i < number; i++) {
                //appends the string at the end
                sb.append(subString);
            }
            return "stackroute" + sb;
        }
        return null;
    }
}
