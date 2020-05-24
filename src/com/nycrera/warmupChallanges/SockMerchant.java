package com.nycrera.warmupChallanges;

import java.util.HashSet;

/**
 * Created by Alperen Asa
 * Date: 24.05.2020
 * Time: 10:46
 * Project Name: The-HackerRank-Interview-Preparation-Kit
 */

public class SockMerchant {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(sockMerchant(arr.length, arr));
    }

    public static int sockMerchant(int n, int[] arr) {
        int pairs = 0;


        HashSet<Integer> pairsSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            if(!pairsSet.contains(arr[i])) {
                pairsSet.add(arr[i]);
            } else {
                pairsSet.remove(arr[i]);
                pairs++;
            }
        }

        return pairs;
    }

}
