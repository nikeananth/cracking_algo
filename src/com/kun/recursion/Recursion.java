package com.kun.recursion;

public class Recursion {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int i){

        if(i==5){
            System.out.println("hello world"+i);
          return;
        }
        System.out.println("hello world"+i);
        message(i+1);

    }
}
