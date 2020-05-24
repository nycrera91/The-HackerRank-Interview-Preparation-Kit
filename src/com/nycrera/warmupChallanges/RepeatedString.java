package com.nycrera.warmupChallanges;

/**
 * Created by Alperen Asa
 * Date: 24.05.2020
 * Time: 11:00
 * Project Name: The-HackerRank-Interview-Preparation-Kit
 */

public class RepeatedString {

    public static void main(String[] args) {

        System.out.println(repeatedString("a", 1000000000000L));

    }

    public static long repeatedString(String s, Long n) {

        long numberOfA = 0L;

        if(n < s.length()) {
            for(int i = 0; i < n; i++) {
                if(s.toCharArray()[i] == 'a') {
                    numberOfA++;
                }
            }

            return numberOfA;
        }

        for (char letter : s.toCharArray()) {
            if(letter == 'a') {
                numberOfA++;
            }
        }

        long divided =  (n / s.length());
        long remain =  (n % s.length());

        if(divided != 0) {
            numberOfA *= divided;
        }

        char[] temp = s.toCharArray();

        for(int i = 0; i < remain; i++) {
            if(temp[i] == 'a') {
                numberOfA++;
            }
        }

        return numberOfA;

    }

}
