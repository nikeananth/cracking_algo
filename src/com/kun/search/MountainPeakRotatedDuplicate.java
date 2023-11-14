package com.kun.search;

public class MountainPeakRotatedDuplicate {


    public static void main(String[] args) {
        int array[]={8,9,1,2,3};
        int peak=searchPeakRotated(array);
        System.out.println(peak);
    }

     static int searchPeakRotated(int arr[]) {
         int start = 0;
         int end = arr.length - 1;
         while (start < end) {
             int mid = start + ((end - start) / 2);
             if (mid<end && arr[mid] > arr[mid + 1]) {
                 return mid;
             } else if (mid>start&&arr[mid] < arr[mid - 1]) {
                 return mid - 1;
             }

             //222278912
             if(arr[mid]==arr[start] && arr[mid]==arr[end]){
               if(arr[start]>arr[start+1]){
                   return start;
               }
                 start++;
                 if(arr[end]<arr[end-1]){
                     return end-1;
                 }
                 end--;
             }
            //9999123
             if (arr[start] <= arr[mid]||(arr[start] ==arr[mid] && arr[mid]>arr[end])) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }
         }
         return start;
     }
}
