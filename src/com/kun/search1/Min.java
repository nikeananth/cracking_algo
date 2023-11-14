package com.kun.search1;

public class Min {

    public static void main(String[] args) {
        System.out.println(min(new int[]{10,20,30,1}));
    }

    static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
