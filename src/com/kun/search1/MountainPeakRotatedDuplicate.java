package com.kun.search1;

public class MountainPeakRotatedDuplicate {


    public static void main(String[] args) {
        int array[]={2,2,2,2,9};
        int peak=searchPeakRotated(array);
        System.out.println(peak);
    }

     static int searchPeakRotated(int arr[]) {
         int start = 0;
         int end = arr.length - 1;
         while (start < end) {
             int mid = start + ((end - start) / 2);
             if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
             }
             else if(mid>start&&arr[mid]<arr[mid-1]){
                 return mid-1;
             }

             if(arr[start]==arr[mid]&& arr[mid]==arr[end]){

                 if(arr[start]>arr[end]){
                     return start;
                 }

                 if(arr[end]<arr[end-1]){
                     return end;
                 }
                     start++;
                     end--;
             }

             if(arr[start]<=arr[mid]||(arr[start]==arr[mid] && arr[mid]>arr[end])){
                 start=mid+1;
             }
             else if(arr[start]>arr[mid]){
                 end=mid-1;
             }
         }
         return start;
     }
}
