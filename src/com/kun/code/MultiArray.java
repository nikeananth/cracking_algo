package com.kun.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiArray {

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
