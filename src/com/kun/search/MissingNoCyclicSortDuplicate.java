package com.kun.search;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNoCyclicSortDuplicate {

    public static void main(String[] args) {
        int arr[]={5,3,4,1,0,1,1};
        System.out.println(sort(arr));

        System.out.println(Arrays.toString(arr));
    }

    private static int sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else{
                   return  arr[i];
                }
            }
            else{
                i++;
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
