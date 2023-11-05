package com.kun.search;

public class MountainPeakRotated {


    public static void main(String[] args) {
        int array[]={4,5,6,7,9};
        int peak=searchPeakRotated(array);
        System.out.println(peak);
    }

     static int searchPeakRotated(int arr[]) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+((end-start)/2);
            if(mid<end && arr[mid]>arr[mid+1]){
             return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
        if(arr[start]<=arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
            }
        }
         return start;
     }
}
