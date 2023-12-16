package com.kun.bitwise;

public class DuplicateRemoval {

    public static void main(String[] args) {
        int arr[]={6,2,2,3,3,4,4};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int arr[]){
         int unique=0;
            for(int a:arr){
                unique=unique^a;
            }
        return unique;
    }
}
