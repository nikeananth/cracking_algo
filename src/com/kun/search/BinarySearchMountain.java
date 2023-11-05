package com.kun.search;

public class BinarySearchMountain {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,3,2,1};
        int index=binarySearch(arr);
        System.out.println(index);
    }
    public static int binarySearch(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return  start;
    }
}

