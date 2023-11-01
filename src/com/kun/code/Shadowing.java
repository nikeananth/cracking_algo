package com.kun.code;

public class Shadowing {
   static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        x=40;
        System.out.println(x);
        add();
    }
    static void add(){
        System.out.println(x);
    }


}
