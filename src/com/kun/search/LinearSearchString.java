package com.kun.search;

import java.sql.SQLOutput;

public class LinearSearchString {
    public static void main(String[] args) {
        System.out.println((search("vijay", 'j')));
    }

    static boolean search(String str, char target) {
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.toCharArray()[i] == target) {
                System.out.println(i);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}

