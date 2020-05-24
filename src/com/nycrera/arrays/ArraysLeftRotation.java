package com.nycrera.arrays;

import java.util.Arrays;

/**
 * Created by Alperen Asa
 * Date: 24.05.2020
 * Time: 11:08
 * Project Name: The-HackerRank-Interview-Preparation-Kit
 */

public class ArraysLeftRotation {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(rotLeft(arr, 4)));
    }

    public static int[] rotLeft(int[] a, int d) {

        int[] rotLeftArray = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            int newIndex = (i + (a.length - d)) % a.length;

            rotLeftArray[newIndex] = a[i];

        }

        return rotLeftArray;

    }

}
