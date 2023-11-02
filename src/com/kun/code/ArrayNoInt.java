package com.kun.code;

import java.util.Arrays;

public class ArrayNoInt {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]='X';
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }

        String arrStr[]=new String[4];
        for(int i=0;i<arrStr.length;i++){
            arrStr[i]="X";
            System.out.println(arrStr[i]);
        }

        int[] ros={10,20,30,40,50};
        for(int i=0;i<ros.length;i++){
            System.out.println(ros[i]);
        }

        System.out.println(Arrays.toString(ros));

    }

}
