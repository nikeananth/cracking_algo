package com.kun.code;

public class Swap {

    public static void main(String[] args) {
        int[] swap = swap(10, 20);
        System.out.println(swap[0]+"swap"+swap[1]);
    }

    static  int[] swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a"+a+""+b+b);
        return new int[]{a,b};
    }
}
