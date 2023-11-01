package com.kun.code;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no a");
        int a=sc.nextInt();
        System.out.println("enter the no a");
        int b=sc.nextInt();
        int ans=sum(a,b);
        System.out.println("answe"+ans);
    }

    static int sum(int a,int b){
       int sum=a+b;
       return sum;
    }



}
