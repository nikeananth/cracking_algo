package com.kun.code;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("max"+max);

        int min=a;
        if(b<min) min = b;
        if(c<min) min = c;
        System.out.println("min"+min);

        int anotherMax=Math.max(c,Math.max(a,b));
        int anotherMin=Math.min(c,Math.min(a,b));
        System.out.println("anotherMax"+anotherMax);
        System.out.println("anotherMin"+anotherMin);

    }
}
