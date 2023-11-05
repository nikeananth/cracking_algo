package com.kun.search;

public class SearchInMountainRotatedArray {


    public static void main(String[] args) {
        int array[]={4,7,9,10};
        int peak=searchPeak(array);
        System.out.println(peak);
        int firstIndex=binarySearch(array,0,peak,7,true);
        int secondIndex=binarySearch(array,peak+1,array.length-1,7,true);
           System.out.println(firstIndex);
        System.out.println(secondIndex);
    }

     static int searchPeak(int arr[]) {
         int start = 0;
         int end = arr.length - 1;
         int ans = -1;
         while (start < end) {
             int mid = start + (end - start) / 2;

             if (mid > start && arr[mid] < arr[mid - 1]) {
                 return mid - 1;
             } else if (mid < end && arr[mid] > arr[mid + 1]) {
                 return mid;
             }
             if (arr[mid] >= arr[start]) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }
         }
         return start;
     }

    static int binarySearch(int arr[],int start,int end,int target,boolean isasc){
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else  if(target<arr[mid]){
                     end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else  if(target<arr[mid]){
                       start=mid+1;
                }
            }
        }
        return index;
    }
}
