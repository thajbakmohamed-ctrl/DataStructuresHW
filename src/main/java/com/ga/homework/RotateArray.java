package com.ga.homework;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        //int[] arr = {15, 20, 25, 30, 35};
        int[] arr = {10, 20, 30, 40, 50, 60};
        //number of positions to rotate
        int d = 2;
        //int d = 7;
       // int d = 3;
       // int d = 0;

        //get the size of the array
        int n = arr.length;
        //call the method to rotate the array
        rotate(arr, d, n);
        //print the array after rotation
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int d, int n) {
        // Check if the array is empty
        if (n == 0) {
            return;
        }
        //get the actual number of rotations
        d = d % n;
        //for loop to repeat the rotation based on d
        for (int i = 0; i < d; i++) {

            //save the first number before moving the elements
            int temp = arr[0];

            //move each number one position to the left
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            //put the first number at the end of the array
            arr[n - 1] = temp;

        }
    }
}
