package com.kun.search;

public class SplitArraySum {

    public static void main(String[] args) {
        System.out.println("binarySearch"+binarySearch());

    }

    static int binarySearch(){
        int m=2;
        int arr[]={1,2,3,4,5,6,7,8,9};
        int max=0;
        int min=0;
        for(int arr1:arr){
            min= Math.max(min,arr1);
            max=max+arr1;
        }

        System.out.println("max"+max);
        System.out.println("min"+min);
        int start=min;
        int end=max;
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;

            for(int num:arr){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return start;
    }
}
