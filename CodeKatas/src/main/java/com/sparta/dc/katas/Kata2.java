package com.sparta.dc.katas;

// 19/06/24
public class Kata2 {
    // +ve/-ve sensitivity
    public static boolean areThereThreeIdenticalNeighboursInARow(int[] intArr) {
        if (intArr.length < 3) return false;

        int matchCounter = 0;
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] == intArr[i + 1]) {
                matchCounter++;
                if (matchCounter == 2) return true;
            } else {
                matchCounter = 0;
            }
        }
        return false;
    }
}
