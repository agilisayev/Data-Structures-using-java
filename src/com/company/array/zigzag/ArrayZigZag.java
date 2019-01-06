package com.company.array.zigzag;

import java.util.Scanner;

public class ArrayZigZag {
    public static void main(String[] args) {
        arrayZigZag();
    }

    static void arrayZigZag() {
        int array[][] = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m * n; i++) {
            array[i / m][((i / m) % 2) * (m - 1) + (1 - 2 * ((i / m) % 2)) * (i % m)] = i + 1;
        }
        /*Array print*/
        arrayPrint(array, m, n);
    }

    static void arrayPrint(int array[][], int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
