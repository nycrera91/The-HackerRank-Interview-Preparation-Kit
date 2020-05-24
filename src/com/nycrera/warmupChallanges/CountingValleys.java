package com.nycrera.warmupChallanges;

/**
 * Created by Alperen Asa
 * Date: 24.05.2020
 * Time: 11:00
 * Project Name: The-HackerRank-Interview-Preparation-Kit
 */

public class CountingValleys {

    public static void main(String[] args) {
        String tracks = "DDUUDDUDUUUD";

        System.out.println(countingValleys(tracks.length(), tracks));
    }

    public static int countingValleys(int n, String s) {

        int valley = 0;
        int seaLevel = 0;

        for(char direction : s.toCharArray()) {
            if(direction == 'D'){
                --seaLevel;
            }else if(direction == 'U'){
                ++seaLevel;
            }

            if(seaLevel == 0 && direction == 'U') {
                valley++;
            }
        }

        return valley;

    }

}
