package com.company.array.max.min;

public class ArrayMinValue {
    public static void main(String[] args) {
        int arr[] = {10, 324, -45, 90, 988, 1};
        System.out.println("Min value: " + minvalue(arr));
    }

    static int minvalue(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array.length < min) {
                min = array[i];
            }
        }
        return min;
    }
}
