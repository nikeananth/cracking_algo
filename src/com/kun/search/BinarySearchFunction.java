package com.kun.search;

public class BinarySearchFunction {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
         int index=binarySearch(arr,4);
        System.out.println(index);
    }
    public static int binarySearch(int arr[],int target){
        if(target>arr[arr.length-1]||target<arr[0]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start+((end-start)/2);
            if(arr[mid]==target){
                System.out.println("arr"+arr[mid]);
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

