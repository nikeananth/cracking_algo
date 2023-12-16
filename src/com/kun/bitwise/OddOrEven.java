package com.kun.bitwise;

public class OddOrEven {

    public static void main(String[] args) {
        int num=68;

        int n= num&1;
        if(n==1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }

}
