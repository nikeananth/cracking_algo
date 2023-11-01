package com.kun.code;

import java.util.Scanner;

public class StringMyGreet {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        String nam1="vijay";
        String personMessage= myGreet(nam1);
        System.out.println("personMessage"+personMessage);
    }

    static  String myGreet(String name){
        String message="Hello"+ name;
        return message;
    }

}
