package com.kun.maths;

public class Factors {

    public static void main(String[] args) {
        factors(20);
        factors2(36);
    }

    static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("i"+i);
            }
        }
    }


    static void factors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print("ssi"+i);
                }
                else{
                    System.out.print("iw "+n/i+" "+i);
                }

            }
        }
    }
}
