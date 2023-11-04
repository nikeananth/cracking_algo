package com.kun.search;

public class BinarySearch {

    public static void main(String[] args) {

       // int arr[]={2,4,5,6,7,8,9,10,11,12};
        int arr[]={12,11,10,9,8,7,5,4,3,2};
        int target=7;
        int start=0;
        int end=arr.length-1;
        boolean iaAsc=Boolean.FALSE;
        if(arr[start]<arr[end]){
            iaAsc=Boolean.TRUE;
        }
        while(start<=end) {
            int mid = start + (end - start / 2); //0+(9-0/2) 4 //5+(9-4/2) 5+2=7
            if (target == arr[mid]) {
                System.out.println("target" + target + "" + mid);
                break;
            }
            if (iaAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                if (target > arr[mid]) {
                    end = mid - 1;
                }
            }

        }
    }
}
