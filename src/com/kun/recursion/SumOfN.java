package com.kun.recursion;

public class SumOfN {


    public static void main(String[] args) {
    //  reverse(5);
        System.out.println(sum(5555));
        System.out.println(reverseparam(4321,4));
        System.out.println(palindrom("anna",0,"anna".length()-1));
        System.out.println(countZero(5005,0));
        System.out.println(steps(14,0));
    }

    static int  sum(int n){
        if(n==0){
            return 0;
        }
        int c= n%10+ sum(n/10);
        return c;
    }


    static  int sum=0;
    static void  reverse(int n){
        if(n%10==0){
            return;
        }
        int rem= n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }


    static int  reverseparam(int n,int digits){
        if(n%10==n){
            return n;
        }
        int c= n%10*(int) (Math.pow(10,digits-1))+ reverseparam(n/10, digits-1);
        return c;
    }


     static boolean palindrom(String str,int s,int e){

        if(s==e){
            return  true;
        }
        if(str.charAt(s)!=str.charAt(e)){
            return  false;
        }
        if(s<e){
            return palindrom(str,s+1,e-1);
        }

        return true;
     }

    static int countZero(int n,int count){
        if(n==0){
            return count;
        }
        int rem= n%10;
        if(rem==0){
            count++;
        }
        return countZero(n/10,count);
    }

    static int steps(int num,int steps){
        if(num==0){
            return steps;
        }

        if(num%2==0){
            return steps(num/2,steps+1);
        }
        return  steps(num-1,steps+1);
    }

}
