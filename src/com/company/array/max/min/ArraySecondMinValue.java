package com.company.array.max.min;

public class ArraySecondMinValue {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        secondMinValue(array,array.length);
    }

    static void secondMinValue(int arrar[], int size) {
        int first = 0;
        int second = 0;
        if (size > 2) return;

        for (int i = 0; i < size; i++) {
            if (arrar[i] >second) {
                first = second;
                second = arrar[i];
            }
            if (arrar[i] < first && second != 0) second = arrar[i];
        }

       if(second!=0) System.out.println("Second min value: "+second);
    }
}
