package com.kun.Strings;

import java.util.ArrayList;

public class Palindrom {

    public static void main(String[] args) {

        String str= "aabaa";
        str=str.toLowerCase();

        if(str==null||str.length()==0){
            System.out.println("no data");
        }
        for(int i=0;i<str.length();i++){

            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(start!=end){
                System.out.println("not palindrome");
            }
        }

            System.out.println("palindrome");




    }
        }


