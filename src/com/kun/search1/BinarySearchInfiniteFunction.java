package com.kun.search1;

public class BinarySearchInfiniteFunction {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
         int index=ans(arr,4);
        System.out.println(index);
    }

    static int ans(int arr[],int target){
       int start=0;
       int end=1;

    while(target>arr[end]){
        int temp=end;
         end=end+(end-start+1)*2;
         start=temp+1;
    }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int arr[],int target,int start,int end){
        if(target>arr[arr.length-1]||target<arr[0]){
            return -1;
        }

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

