package com.company.array.reserve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Agil Isayev";
        char[] tempArray = input.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char c : tempArray) {
            characterList.add(c);
        }
        Collections.reverse(characterList);
        ListIterator listIterator = characterList.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
    }
}
