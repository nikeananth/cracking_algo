package com.kun.recursion;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static  int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
