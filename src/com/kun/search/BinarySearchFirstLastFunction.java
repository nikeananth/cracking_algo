package com.kun.search;

public class BinarySearchFirstLastFunction {

    public static void main(String[] args) {
        int arr[]={1,2,4,4,5,6,7,8,9,10};
         int first_index=binarySearch(arr,9,true);
         int  last_index=binarySearch(arr,9,false);
        System.out.println(first_index);
        System.out.println(last_index);
    }
    public static int binarySearch(int arr[],int target,boolean firstOccurence){
        if(target>arr[arr.length-1]||target<arr[0]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid= start+((end-start)/2);
            if(arr[mid]==target){
                System.out.println("arr"+arr[mid]);
                ans=mid;
                if(firstOccurence){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
        }
        return ans;
    }
}

