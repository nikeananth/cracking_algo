package com.kun.search1;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){

            int selectedIndexToSwap=arr.length-i-1;
            int max=findMax(arr,0,arr.length-i-1);  //0,1,2,3,4
                //swap
            swap(arr,i,selectedIndexToSwap);
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
