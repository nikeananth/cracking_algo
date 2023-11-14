package com.kun.search1;

public class BinarySearchFunction {

    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9,10};
         int index=binarySearch(arr,2);
        System.out.println(index);
    }
    public static int binarySearch(int arr[],int target){
        if(target<arr[0]||target>arr[arr.length-1]) {
                return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(target==arr[mid]){
                System.out.println("mid"+mid);
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
        }
        return  -1;
    }
}

