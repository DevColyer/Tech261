package com.sparta.dc.katas;

// 19/06/24
public class Kata2 {
    public static final int ITERATION_COUNT = 3;

    // +ve/-ve sensitivity
    public static boolean hasXInARow(int[] intArr) {
        if (intArr != null) {
            if (intArr.length < (ITERATION_COUNT)) return false;

            int matchCounter = 0;
            for (int i = 0; i < intArr.length - 1; i++) {
                if (intArr[i] == intArr[i + 1]) {
                    matchCounter++;
                    if (matchCounter == (ITERATION_COUNT - 1)) return true;
                } else {
                    matchCounter = 0;
                }
            }
        }
        return false;
    }
}
