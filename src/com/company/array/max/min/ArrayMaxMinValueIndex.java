package com.company.array.max.min;

public class ArrayMaxMinValueIndex {
    public static void main(String[] args) {
        int array[] = {1, 209, 3, 4, 56, 78, 9, -9};
        System.out.println("Max value index: " + maxValueIndex(array));
        System.out.println("Min value index: " + minValueIndex(array));
    }

    static int maxValueIndex(int array[]) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    static int minValueIndex(int array[]) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
