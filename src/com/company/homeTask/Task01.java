package com.company.homeTask;

public class Task01 {

    public static void main(String[] args) {
        System.out.println(spaceDeleter("Я стану програмистом"));
    }

    static String spaceDeleter(String str) {
        if(str ==null){
            throw new IllegalArgumentException();
        }
        return str.replace(" ", "");
    }
}
