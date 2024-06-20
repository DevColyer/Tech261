package com.sparta.dc.katas;

// 19/06/24
public class Kata2 {
    public static final int MATCH_COUNT = 2;

    // +ve/-ve sensitivity
    public static boolean areThereThreeIdenticalNeighboursInARow(int[] intArr) {
        if (intArr != null) {
            if (intArr.length < (MATCH_COUNT + 1)) return false;

            int matchCounter = 0;
            for (int i = 0; i < intArr.length - 1; i++) {
                if (intArr[i] == intArr[i + 1]) {
                    matchCounter++;
                    if (matchCounter == MATCH_COUNT) return true;
                } else {
                    matchCounter = 0;
                }
            }
            return false;
        }
        return false;
    }
}
