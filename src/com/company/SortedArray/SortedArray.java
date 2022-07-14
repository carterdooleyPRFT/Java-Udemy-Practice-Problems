package com.company.SortedArray;


import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
     static Scanner in = new Scanner(System.in);


    public static int[] getIntegers(int arraySize) {
        System.out.println("Enter your numbers");
        int [] unsortedArray = new int[arraySize];
        int x = 0;
        while (x < arraySize) {

            unsortedArray[x] = in.nextInt();

            x++;
        }
        System.out.println(Arrays.toString(unsortedArray));
        return unsortedArray;
    }

    public static void printArray(int[] array){
        int x = 0;
        while (x < array.length) {
            System.out.println("Element " + x + " contents " + array[x]);
            x++;
        }
    }

    public static int[] sortIntegers(int[] array){
        int x = 0;
        int y = 1;
        Arrays.sort(array);
        int[] newArr = new int[array.length];
        while (x < array.length){
            newArr[x] = array[array.length - y];
            y++;
            x++;
        }
        return newArr;
    }

}


