package com.kun.recursion;

public class Factorial {


    public static void main(String[] args) {
    //  reverse(5);
        System.out.println(factorial(5));
    }

    static int  factorial(int n){
        if(n<=1){
            return 1;
        }
        int c= n* factorial(n-1);
        return c;
    }

}
