package com.kun.search1;

import java.util.Arrays;

public class MissingNoCyclicSort {

    public static void main(String[] args) {
        int arr[]={5,3,4,1,0};
        System.out.println(sort(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static int sort(int[] arr) {
        int i=0;
        while(i<arr.length){

            int correct=arr[i];
            if(correct<arr.length &&  arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;

    }

    private static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
