package com.company.array.sum;

public class SingleDigitsSum {
    public static void main(String[] args) {
        int number = -1234;
        System.out.println("Sum digits: " + sumDigits(number));
    }

    static int sumDigits(int number) {
        int sum = 0;
        while (number > 0 ) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }


}
