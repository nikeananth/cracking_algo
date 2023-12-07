package com.kun.search;

public class BubbleSort {


    public static void main(String[] args) {

        int arr[]={5,4,3,2,1};


/*        for(int i=0;i<arr.length;i++){
            Boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){

                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }
            System.out.println(arr[arr.length-i-1]);
        }*/


        for(int i=0;i<arr.length-1;i++){
            Boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
               }
            System.out.println(arr[arr.length-i-1]);
            }

        }

    }

