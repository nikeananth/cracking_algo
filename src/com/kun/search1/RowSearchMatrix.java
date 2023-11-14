package com.kun.search1;

public class RowSearchMatrix {

    public static void main(String[] args) {
        int arr[][] = {
                {10, 20, 30, 40},
                {21, 22, 23, 24},
                {55, 65, 75, 85},
                {95, 105, 115, 125}
        };
        //search(arr[0],20);
        int target=21;
         int rc[]=reduce(arr,target);
        int cl=arr[0].length-1;
        int cmid=cl/2;
        int start=0;

        if(arr[rc[0]][cmid]==target){
            System.out.println("found");
        }
        if(arr[rc[0]+1][cmid]==target){
            System.out.println("found");
        }
        search(arr[rc[0]], target, start, cmid);
        System.out.println("search found loop1");
        search(arr[rc[0]], target, cmid+1, cl);
        System.out.println("search found loop2");
        search(arr[rc[0]+1], target,start, cmid);
        System.out.println("search found loop3");
        search(arr[rc[0]+1], target,cmid+1, cl);
        System.out.println("search found loop4");


    }

    static int search(int[] arr,int target,int start,int end) {


         while(start<=end) {
             int mid = start + ((end - start) / 2);
             if (arr[mid] == target) {
                 System.out.println("search found"+mid);
                 return mid;
             }
             if (target < arr[mid]) {
                 end = mid - 1;
             } else if (target > arr[mid]) {
                 start = mid + 1;
             }
         }
         return -1;
         }

    static  int[] reduce(int arr[][],int target){

        int rl=arr.length-1;
        int cl=arr[0].length-1;
        int start=0;
        int cmid=cl/2;
        int end=rl-1;

        while(start<end-1){
              int rmid=start+((end-start)/2);
            if(arr[rmid][cmid]==0){
                return new int[]{rmid,cmid};
            }
            if(target<arr[rmid][cmid]){
                end=rmid;
            }
            else if(target>arr[rmid][cmid]){
                start=rmid;

            }
        }

        return new int[]{start,end};
    }



}


