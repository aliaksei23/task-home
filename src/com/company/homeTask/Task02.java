package com.company.homeTask;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {

        String str = "beautiful beach";
        char[] carray = str.toCharArray();
        System.out.println("Скторка :" + str);
        System.out.print("Повторяющиеся символы в ней : ");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                }
            }
        }
    }

}
