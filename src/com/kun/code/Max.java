package com.kun.code;

public class Max {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,19};

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
             max=arr[i];
         }
        }
        System.out.println(max);

        int max1=Integer.MIN_VALUE;
        int start=1;
        int end =3;
        for(int i=start;i<=end;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        System.out.println(max1);
    }
}
