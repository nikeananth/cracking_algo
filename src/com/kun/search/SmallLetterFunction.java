package com.kun.search;

public class SmallLetterFunction {

    public static void main(String[] args) {
        char arr[]={'a','b','c','d','e'};
         int index=binarySearch(arr,'f');
        System.out.println(index);
    }
    public static int binarySearch(char arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end&& end>=0){
            int mid= start+(end-start/2);
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
        return start%arr.length;
    }
}

