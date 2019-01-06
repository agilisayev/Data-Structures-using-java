package com.company.array.max.min;

public class ArrayMaxValue {

    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 988, 1};
        System.out.println("max value : " + maxValue(arr));

    }

    static int maxValue(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
