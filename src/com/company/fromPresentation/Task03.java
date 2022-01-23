package com.company.fromPresentation;

public class Task03 {

    public static void main(String[] args) {

        String str = "25 + 40 = 65";
        System.out.println(metod1(str));
        System.out.println(metod2(str));
    }

    static String metod1(String string) {

        StringBuilder stringBuilder = new StringBuilder(string);
        int i = stringBuilder.indexOf("=");
        stringBuilder.deleteCharAt(i);
        stringBuilder.insert(i, "равно");
        return stringBuilder.toString();
    }

    static String metod2(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int i = stringBuilder.indexOf("=");
        stringBuilder.replace(i, i + 1, "равно");
        return stringBuilder.toString();
    }
}
