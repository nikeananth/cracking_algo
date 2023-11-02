package com.kun.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,19};

        int index1=1;
        int index2=3;

        int temp=arr[index2];
        arr[index1]=arr[index2];
        arr[index2]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
