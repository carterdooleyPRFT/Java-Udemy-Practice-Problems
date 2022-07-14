package com.company.MinumElement;

import java.util.Scanner;

public class MinimumElement {

    static Scanner in = new Scanner(System.in);


    private static int readInteger() {
        int integerAmount = in.nextInt();
        return integerAmount;
    }

    private static int[] readElements(int integer1) {
        int [] arr = new int[integer1];
        int x = 0;
        while (x < integer1) {

            arr[x] = in.nextInt();

            x++;
        }
        return arr;
    }

    private static int findMin(int[] arr) {
        int minimumValue = arr[0];
        int x = 0;

        while (x < arr.length) {
            if (arr[x] < minimumValue) {
                minimumValue = arr[x];
            }


            x++;
        }



        return minimumValue;
    }



}
