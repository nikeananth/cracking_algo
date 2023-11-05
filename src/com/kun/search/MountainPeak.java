package com.kun.search;

public class MountainPeak {


    public static void main(String[] args) {
        int array[]={1,2,4,5,6,7,6,4,3,1};
        int peak=searchPeak(array);
        System.out.println(peak);
    }

     static int searchPeak(int arr[]) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+((end-start)/2);
            if( arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
         return start;
     }
}
