package com.kun.search;

public class SearchInMountainArray {


    public static void main(String[] args) {
      //  int array[]={1,2,3,4,5,3,2,1};
        int array[]={1,2,3,4,5};
        int peak=searchPeak(array);
        System.out.println(peak);
        int firstIndex=binarySearch(array,0,peak,3,true);
        int secondIndex=binarySearch(array,peak+1,array.length-1,3,false);
        System.out.println(firstIndex);
        System.out.println(secondIndex);
    }

     static int searchPeak(int arr[]){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
         System.out.println("end"+end);
        return start;
    }

    static int binarySearch(int arr[],int start,int end,int target,boolean isasc){
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else  if(target<arr[mid]){
                     end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else  if(target<arr[mid]){
                       start=mid+1;
                }
            }
        }
        return index;
    }
}
