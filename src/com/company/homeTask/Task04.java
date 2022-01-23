package com.company.homeTask;

public class Task04 {

    public static void main(String[] args) {

        System.out.println(reverseString("qwerty"));
    }

    static private String reverseString(String str) {
        if(str == null) {
            throw new IllegalArgumentException();
        }

        char[] chars = str.toCharArray();
        char[] reverseChars = new char[chars.length];
        for(int i = chars.length - 1; i >= 0; i--) {
            reverseChars[chars.length - 1 - i] = chars[i];
        }
        return String.valueOf(reverseChars);
    }
}
