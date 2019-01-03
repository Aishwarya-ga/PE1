package com.unit.Junittest;



public class AppendingString {
    public String append(String string, int number){
        String sub_string;

        /*takes the substring at the mentioned position*/
        sub_string = string.substring(number);

        StringBuffer sb = new StringBuffer(sub_string);
        for( int i = 0 ; i< number; i++){
            /*appends the string at the end*/
            sb.append(sub_string);
        }
        return "stackroute"+sb;

    }
}
