package com.kun.code;

public class Loop {

    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            System.out.println(i);
        }

        int num=1;
        while(num<=5){
            System.out.println(num);
            num++;
        }

        int n=1;
        do{

            System.out.println("n"+n);
            n++;
        }while(n<=5);
    }
}
