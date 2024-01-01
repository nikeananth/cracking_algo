package com.kun.recursion;

public class Pattern {

    public static void main(String[] args) {
        // traingle(4,0);
        normalTraingle(4,0);
    }

    static void traingle(int r,int c){
        if(r==0){
            return;
        }

        if(c<r){
            System.out.print("*");
            traingle(r,c+1);
        }
        else{
            System.out.println();
            traingle(r-1,0);
        }
        }


    static void normalTraingle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            normalTraingle(r,c+1);
            System.out.print("*");
        }
        else{
            normalTraingle(r-1,0);
            System.out.println();
        }
    }
}
