/*Write a program which accepts a number as input from user and perform the following:
*        a. sort the number in non-increasing order
*        b. after sorting sum all the even numbers, the sum should be greater than 15 .
*        c. if sum is more than 15,then print output as true or false.

*        Input  : 234534
*        Output : Sorted number in non-increasing order : 544332
*        Sum of even numbers : 10
*        False*/
package com.stackroute.pe1;

public class SortNumbers {
    /*
    method to sort and sum the sorted numbers
     */
    public int sumOfNumbers(int input) {
        int[] arr = new int[20];
        int s, i;
        /*putting the integer into the array*/
        for (i = 0; input > 0; input = input / 10, i++) {
            s = input % 10;
            arr[i] = s;
        }
        /*sorting the digits in non increasing order*/
        for (int k = 0; k < i - 1; k++) {
            for (int j = 0; j < i - k - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int sum = 0;
        for (int k = 0; k < i; k++) {
            if (arr[k] % 2 == 0)            //summing the even numbers
                sum += arr[k];
        }
        return sum;
    }
}

