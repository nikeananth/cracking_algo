package com.kun.search1;

public class NormalSort {

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        System.out.println("");
        normalSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    private static void normalSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                //swap
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }


}
