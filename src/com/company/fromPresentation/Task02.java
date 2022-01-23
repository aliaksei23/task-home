package com.company.fromPresentation;

public class Task02 {

    public static void main(String[] args) {
        String string1 = "Hello I'm working in IT";
        String string2 = "Hello I'm working in IT";
        System.out.println(metod(string1, string2));
    }

    static boolean metod(String str1, String str2) {

        if(str1 == null) {
            return false;
        }

        String substring1 = str1.substring(str1.length() - 5);
        String substring2 = str2.substring(str2.length() - 5);

        if(substring1.equals(substring2)) {
            System.out.println("Последние 5 символов совпадают");
        } else {
            System.out.println("Последние 5 символов не совпадают");
            return false;
        }
        return true;
    }
}
