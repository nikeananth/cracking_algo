package com.kun.recursion;

import java.util.ArrayList;

public class Sort {

    public static void main(String[] args) {
    int arr[]={1,2,3,5,6,7,8,9};
        System.out.println(sorted(arr,0));

        System.out.println(linerSearch(arr,5,0));

        System.out.println(linerSearchInt(arr,5,0));
        System.out.println(linerSearchIntLast(arr,5,7));

        ArrayList lst=new ArrayList();
        int arr1[]={1,2,3,5,5,7,8,9};
        ArrayList<Integer> lstback=linerSearchArrayList(arr1,5,0,lst);
        for(Integer a:lstback){
            System.out.println("aaaa"+a);
        }
        ArrayList<Integer> lstback1=linerSearchArrayListBelow(arr1,5,0);
        for(Integer a:lstback1){
            System.out.println("vvvvv"+a);
        }

    }

    static Boolean sorted(int arr[],int index){

        if(index==arr.length-1){
            return  true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);

    }



    static  Boolean linerSearch(int arr[], int target, int index){
        if(index==arr.length){
            return Boolean.TRUE;
        }
      return arr[index]==target || linerSearch(arr,target,index+1);
    }


    static  int linerSearchInt(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
           return linerSearchInt(arr, target, index + 1);
        }
    }

    static  int linerSearchIntLast(int arr[], int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }else{
            return linerSearchIntLast(arr, target, index - 1);
        }
    }





    static  ArrayList linerSearchArrayList(int arr[], int target, int index,ArrayList lst){
        if(index==arr.length){
            return lst;
        }
        if(arr[index]==target){
            lst.add(index);
        }
       return linerSearchArrayList(arr,target,index+1,lst);
    }


    static  ArrayList<Integer> linerSearchArrayListBelow(int arr[], int target, int index){

        ArrayList<Integer> lst=new ArrayList();
        if(index==arr.length){
            return lst;
        }
        if(arr[index]==target){
            lst.add(index);
        }
        ArrayList<Integer> lstbelow=  linerSearchArrayListBelow(arr,target,index+1);
        lst.addAll(lstbelow);
        return lst;
    }



}
