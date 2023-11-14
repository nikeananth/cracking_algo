package com.kun.search1;

public class Search2DArray {

    public static void main(String[] args) {
      int arr[][]={
            {10, 20, 30, 1},
            {10, 20, 9, 1},
            {10, 20, 30, 1}
        };
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[][] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
