package com.nycrera.warmupChallanges;

/**
 * Created by Alperen Asa
 * Date: 24.05.2020
 * Time: 11:00
 * Project Name: The-HackerRank-Interview-Preparation-Kit
 */

public class JumpingOnTheClouds {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnTheClouds(arr));
    }

    public static int jumpingOnTheClouds(int[] c) {

        int jumpNumber = -1;
        int size = c.length;

        for(int i = 0; i < c.length; i++, jumpNumber++) {

            if(i < size - 2 && c[i+2] == 0) {
                i++;
            }

        }

        return jumpNumber;
    }

}
