package com.kun.code;

public class PrimeNumber {

    public static void main(String[] args) {
        int num=3;
        int c=2;
        boolean flag=Boolean.FALSE;
        while(c<num){
            if(num%c==0){
                System.out.println("not prime no");
                flag=Boolean.TRUE;
                break;
            }
            c++;
        }
        if(!flag) {
            System.out.println("prime no :-)");
        }

        int num1=3;
        int c1=2;
        boolean fl=Boolean.FALSE;
        while(c1<num){
            if(num1%c1==0){
                System.out.println("not prime no");
                fl=Boolean.TRUE;
                break;
            }
            c1++;
        }
        if(!flag){
            System.out.println("prime no");
        }
    }
}
