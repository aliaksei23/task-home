package com.company.fromPresentation;

public class Task01 {

    public static void main(String[] args) {

        String string = "Я изучаю Java";
        String string2 = "скоро стану программистом";

        System.out.print(metod1(string) + " ");
        System.out.print(metod2(string2));

    }

    static String metod1(String str) {
        return String.valueOf(str.charAt(0));
    }

    static char[] metod2(String str) {
        char[] res = new char[19];
        str.getChars(6, 25, res, 0);
        return res;
    }
}
