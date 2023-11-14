package com.kun.search1;

public class CeilingOfNumber {
    public static void main(String[] args) {
         int arr[]={2,4,5,6,7,8,9,11,12};
        int target=15;
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
        if(start>arr.length-1) {
            System.out.println("ceil does not exist");
        }
    }
}
