package com.kun.recursion;

public class ReverseNo {


    public static void main(String[] args) {
    //  reverse(5);
      reverseOrd(5);
    }

    static void reverse(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        reverse(--n);
    }

    static void reverseOrd(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        reverseOrd(n-1);
        System.out.println(n);
    }

}
