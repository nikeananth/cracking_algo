package com.kun.search;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[]={5,4,3,2,1};

        for(int i=0;i<arr.length-1;i++){

            int last=arr.length-i-1;

            int maxindex=getMax(arr,0,last);
            swap(arr,arr.length-i-1,maxindex);
        }
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void swap(int[] arr, int a, int b) {
    int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
    }

    private static int getMax(int[] arr, int start, int last) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=start;i<=last;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }


        return index;
    }
}
