package com.kun.search1;

public class RowMatrix {

    public static void main(String[] args) {
        int arr[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {55, 65, 75, 85},
                {95, 105, 115, 125}
        };
        search(arr);
    }

    static int search(int[][] arr) {
        int r=0;
        int c=arr[0].length-1;
        int target=65;
        while (r<arr.length && c>=0){
            if(arr[r][c]==target){
                System.out.println(arr[r][c]);
                return arr[r][c];
            }
            if(target > arr[r][c]){
                r++;
            }else if(target < arr[r][c]){
                c--;
            }
        }


        return -1;
    }
}


