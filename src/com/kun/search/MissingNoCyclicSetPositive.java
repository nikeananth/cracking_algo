package com.kun.search;

import java.util.Arrays;

public class MissingNoCyclicSetPositive {

    public static void main(String[] args) {
       // int arr[]={-1,5,3,4,1};
        int arr[]={1,2,4};
        System.out.println(sort(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static int sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0&&correct<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
