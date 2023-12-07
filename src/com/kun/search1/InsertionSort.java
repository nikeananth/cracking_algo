package com.kun.search1;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    private static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                else{
                    break;
                }
                }
            }
        }

    private static void swap(int[] arr, int i, int selectedIndexToSwap) {
        if(arr[i]<arr[selectedIndexToSwap]){
            int temp=arr[i];
            arr[i]=arr[selectedIndexToSwap];
            arr[selectedIndexToSwap]=temp;
        }
    }

    private static int findMax(int[] arr,int start,int end) {
        int max=start;
         for(int i=start;i<=end;i++){
             if(arr[max]<arr[i]){
                max=i;
             }
        }
    return max;
}

}
