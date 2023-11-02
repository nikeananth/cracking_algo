package com.kun.search;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5,6},5));
    }

    static int linearSearch(int arr[],int target){

        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
