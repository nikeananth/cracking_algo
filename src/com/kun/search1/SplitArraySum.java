package com.kun.search1;

public class SplitArraySum {

    public static void main(String[] args) {
        System.out.println("binarySearch"+binarySearch());

    }

    static int binarySearch(){
        int m=2;
        int arr[]={1,2,3,4,5,6,7,8,9};
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int num:arr){
            min=Math.min(min,num);
            max=max+num;
        }

        while(min<max) {
            int piece = 0;
            int mid=min+(max-min)/2;
            int sum = 0;
            for (int num : arr) {
                if (sum > mid) {
                    sum = num;
                    piece++;
                } else {
                    sum = sum + num;
                }
            }
            if(piece<=m){
                min=mid+1;
            }
            else{
                   max=mid;
            }
        }
        return min;
    }
}
