package com.company.homeTask;

public class Task03 {

    public static void main(String[] args) {
        System.out.println(worsCounter("dsgfadsg dasg asd sadg asf a"));
    }

    static private int worsCounter(String string) {
        int count = 0;
        String[] s = string.split(" ");

        for(String value : s) {
            if(value.length() >= 2) {
                count++;
            }
        }

        return count;
    }
}
