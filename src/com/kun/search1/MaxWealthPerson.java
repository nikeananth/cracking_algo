package com.kun.search1;

public class MaxWealthPerson {

    public static void main(String[] args) {
        int arr[][]={
                {10, 20, 30, 1},
                {10, 20, 9, 1},
                {10, 20, 30, 1}
        };
        System.out.println(maxWealth(arr));
    }

    public static int maxWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int person : ints) {
                sum += person;
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}


