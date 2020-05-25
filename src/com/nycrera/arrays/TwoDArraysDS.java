package com.nycrera.arrays;

/**
 * Created by Alperen Asa
 * Date: 25.05.2020
 * Time: 21:26
 * Project Name: The-HackerRank-Interview-Preparation-Kit
 */

public class TwoDArraysDS {

    public static void main(String[] args) {

        int[][] arr = new int[][]{ {-9, -9, -9,  1, 1, 1},
                                  {  0, -9,  0,  4, 3, 2},
                                  { -9, -9, -9,  1, 2, 3},
                                  {  0,  0,  8,  6, 6, 0},
                                  {  0,  0,  0, -2, 0, 0},
                                  {  0,  0,  1,  2, 4, 0} };

        System.out.println(hourglassSum(arr));

    }

    public static int hourglassSum(int[][] arr){

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {

                if(i-1>=0 && j-1>=0 && j+1 < arr[0].length && i+1 < arr.length) {
                    int upLine = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1];
                    int current = arr[i][j];
                    int bottomLine = arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];

                    int currentSum = upLine + current + bottomLine;

                    if(currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }

            }
        }

        return maxSum;

    }

}
