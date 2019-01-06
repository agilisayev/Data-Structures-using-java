package com.company.array.sorting;

public class ArrayBubbleSorting {

    public static void main(String[] args) {
        int array[] = {20, 35, -15, 7, 55, 1, -22};
        buubleSort(array);
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void buubleSort(int array[]) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
