package com.kun.code;

public class ArmStrongNo {

    public static void main(String[] args) {
        int originalNo=13;
        boolean isArm=isArmStrong(14);
        for(int i=1000;i<10000;i++){
            if(isArmStrong(i)){
                System.out.println(i);
            }

        }
    }

    static boolean isArmStrong(int originalNo){
        int ans=0;
        int n=originalNo;
        while(originalNo>0){
            int rem=originalNo%10;
             ans= ans+base(rem,4);
             originalNo=originalNo/10;
        }
        if(n==ans)
        {
            return true;
        }
        return false;
    }

    static  int base(int rem,int noOfDigits){
        int ans=1;
        for(int i=1;i<=noOfDigits;i++){
            ans=ans*rem;
        }
        return ans;
    }


}
