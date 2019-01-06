package com.company.array.max.min;

import java.util.Arrays;

public class ArrayMaxMinValueWithStream {

    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 808};
        System.out.println("max value: " + maxValue(arr));
        System.out.println("min value: " + minValue(arr));
    }

    static int maxValue(int arr[]) {
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }

    static int minValue(int arr[]) {
        int min = Arrays.stream(arr).min().getAsInt();
        return min;
    }


}
