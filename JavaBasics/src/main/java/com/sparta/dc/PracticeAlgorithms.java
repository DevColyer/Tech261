package com.sparta.dc;

import java.time.LocalTime;

public class PracticeAlgorithms {

    public static void main(String[] args) {
        int[] arrToSort = { // test data
                2948, 1894, 107, 2954, 3608, 3195, 4269, 825, 1467, 788,
                2064, 4777, 598, 1296, 3938, 2765, 4016, 2638, 1851, 4637,
                3083, 892, 4978, 3647, 4389, 1504, 3898, 1968, 2954, 3011,
                2522, 3502, 36, 1299, 2024, 4362, 1853, 2399, 872, 1695,
                1679, 2096, 1882, 3653, 3060, 4476, 2677, 1443, 1653, 4619,
                2926, 4169, 97, 868, 529, 3627, 85, 1430, 3727, 2538,
                1537, 634, 2879, 1303, 1590, 3512, 238, 3045, 1449, 3662,
                3463, 498, 4260, 2471, 3247, 4978, 4194, 1395, 723, 566,
                2901, 2859, 4697, 3842, 775, 2868, 3057, 3343, 1577, 461,
                2679, 1165, 3044, 2524, 406, 1210, 4241, 2904, 675, 1027
        };

        printArray(arrToSort); // print test data as is
        quickSort(arrToSort, 0, arrToSort.length - 1); // sort
        System.out.println("\nArray Sorted");
        printArray(arrToSort); // print sorted data
    }

    private static void printArray(int[] arrToSort) {
        for (int i : arrToSort) {
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int quickSortPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) { // just for integers cause lazy
        if (low < high) {
            int pIndex = quickSortPartition(arr, low, high);

            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }
}
