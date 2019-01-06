package com.company.strings.wordsCount;

public class CountWords {

    static final int OUT = 0;
    static final int IN = 1;

    public static void main(String[] args) {

        String input = "Agil isayev";
        System.out.println(countWords(input));
    }

    static int countWords(String word) {

        int state = OUT;
        int wordCount = 0;
        int i = 0;
        while (i < word.length()) {
            if (word.charAt(i) == ' ' || word.charAt(i) == '\n'
                    || word.charAt(i) == '\t')
                state = OUT;
            else if (state == OUT) {
                state = IN;
                ++wordCount;
            }
            ++i;
        }
        return wordCount;
    }
}
