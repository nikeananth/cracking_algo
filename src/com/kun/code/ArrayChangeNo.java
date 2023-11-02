package com.kun.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayChangeNo {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void change(int[] arr){
      arr[0]=99;
    }
}
