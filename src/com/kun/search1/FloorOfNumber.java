package com.kun.search1;

public class FloorOfNumber {
    public static void main(String[] args) {
         int arr[]={1,2,4,5,6,7,8,9,11,12};
        int target=3;
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid=start+(end-start/2);
            if (target == arr[mid]) {
                System.out.println("ceil" + target + "" + mid);
                break;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else  if(target<arr[mid]){
                end=mid-1;
            }
        }
        System.out.println(end);
        System.out.println(start);
        if(end<0) {
           System.out.println("floor does not exsit"+end);
        }
    }
}
