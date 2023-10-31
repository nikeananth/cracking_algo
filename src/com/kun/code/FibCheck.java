package com.kun.code;

import java.util.Scanner;

public class FibCheck {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=n)
        {
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);



        int a1=0;
        int b1=1;
        int counter=2;
        while(counter<=n){
            int temp=b1;
            b1=a1+b1;
            a1=temp;
            System.out.print("b1"+b1);
            counter++;
        }
        System.out.println("");
    }
}
