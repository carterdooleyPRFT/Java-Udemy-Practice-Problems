package com.company.SortedArray;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int [] arr) {
        int x = 0;
        int y = 1;
        int[] newArr = new int[arr.length];
        while (x < arr.length){
            newArr[x] = arr[arr.length - y];
            y++;
            x++;
        }
        System.out.println("Array = " + Arrays.toString(arr) + "Reversed array = " + Arrays.toString(newArr));
    }


}
