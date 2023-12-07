package com.kun.search1;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        int arr1[]={9,8,7,6,5,4,3,2,1};
        System.out.println("");
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    private static void bubbleSortOther(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                //swap
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
