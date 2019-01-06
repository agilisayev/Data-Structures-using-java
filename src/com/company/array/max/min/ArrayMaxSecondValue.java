package com.company.array.max.min;

public class ArrayMaxSecondValue {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        secondMaxValue(array,array.length);
    }

    static void secondMaxValue(int array[], int size) {
        int first = 0;
        int second = 0;
        if (size < 2) return;

        for (int i = 0; i < size; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] != first) second = array[i];
        }
        if (second != 0) System.out.print("Second max value: " + second);

    }
}
