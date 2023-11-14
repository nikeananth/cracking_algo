package com.kun.search1;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5,6},5));
    }

    static int linearSearch(int arr[],int target){

        if(arr.length==0){
            return -1;
        }

      /*  for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("found");
                return i;
            }
        }*/

    /*    int count=0;
        while(count<arr.length){
            if(arr[count]==target){
                System.out.println("found");
                return count;
            }
            count++;
        }*/
       int count1=arr.length-1;
        while(count1>=0){
            if(arr[count1]==target){
                System.out.println("found");
                return count1;
            }
            count1--;
        }
        return -1;
    }
}
