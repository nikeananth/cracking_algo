package com.kun.search;

public class EvenDigits {

    public static void main(String[] args) {
        int a[]={123,1111,3,22222};
        for(int i=0;i<a.length;i++){
            if(noOfDigits(a[i])%2==0){
                System.out.println(a[i]);
            }
        }

        for(int i=0;i<a.length;i++){
            if(digitslog(a[i])%2==0){
                System.out.println(a[i]);
            }
        }
    }
    static int noOfDigits(int num) {
        int ans=0;
        int count=0;
      while(num>0){
          num=num/10;
          count++;
      }
      return count;
    }

    static int digitslog(int num){
        return (int)Math.log10(num)+1;
    }


}
