package com.kun.bitwise;

public class Ibit {

    public static void main(String[] args) {
        findIbit();
        setIbit();
        resetIbit();
        firstIBit();
        duplicateModulo();
        nMagicNO();
        powerOf2();
        basePower();
        rangeXor();
    }

   static void findIbit(){
        int a=15;
        int n=2;

        int c= a & (1<<(n-1));
        System.out.println(c);
    }

    static  void setIbit(){
        int a=15;
        int n=2;

        int c= a | (1<<(n-1));
        System.out.println(c);
    }


    static  void resetIbit(){
        int a=15;
        int n=2;
        int c= a & ~(1<<(n-1));
        System.out.println(c);
    }

    static  void firstIBit(){
        int a=15;
        int n=2;
        int c= n &(-n);
        System.out.println(c);
    }

    static void duplicateModulo(){
        int arr[]={2,2,2,3,3,3,7,7,7,4};
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        int ans=sum%3;
        System.out.println(ans);

    }

    static void nMagicNO(){
        int n=6;
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            ans +=last*base;
            n=n>>1;
            base=base*5;
        }
        System.out.println(ans);
    }

    static void NoOfDigitsBase(){

        int n=10;
        int b=2;

        int ans= (int)(Math.log(n)/Math.log(b))+1;

    }

    static void powerOf2(){
        int n=15;

        int ans=n&(n-1);
        if(ans==0){
            System.out.println("power of 2");
        }
        else{
            System.out.println("not of power of 2");
        }
    }
    static void basePower(){

        int base=2;
        int power=4;

        int ans=1;

        while(power>0){
            if((power&1)==1){
             ans=ans*base;
            }
            base=base*base;
            power=power>>1;
        }
        System.out.println(ans);
    }

    static void  setBits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
    }

    static void rangeXor(){
        int a=3;
        int b=9;

        int ans=0;
        for(int i=a;i<=b;i++){
            ans^=i;
        }
        System.out.println(ans);
    }

    void flipImagge(){
        int arr[][]={{1,1,0},{1,1,0}};

      for( int row[]:arr){
          for(int i=0;i<(row.length+1/2);i++){
              int temp=row[i]^1;
              row[i]=row[row.length-i-1];
              row[row.length-i-1]=temp;
          }
      }
    }

}
