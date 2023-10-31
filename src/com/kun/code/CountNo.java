package com.kun.code;

import java.util.Scanner;

public class CountNo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = 133433;
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
        //reverse
        int num=987654321;
        int count1=0;
        int answer=0;
        while(num>0){
            int rem=num%10;
            answer=answer*10+rem;
            num=num/10;
        }
        System.out.println("reverser"+answer);
        //count digits
        int num1=544433;
        int counter=0;
        while(num1>0){
            int rem=num1%10;
            if(rem==4){
                counter++;
            }
            num1=num1/10;
        }
        System.out.println("counter"+counter);

    }
}
