package com.kun.code;

public class PrimeNumberTune {

    public static void main(String[] args) {
        int num = 7;
        int c = 2;
        Boolean flag = Boolean.FALSE;
        while (c * c <= num) {

            if (num % c == 0) {
                flag = true;
                System.out.println("not a prime");
                break;
            }
            c=c+1;
        }
        if (!flag) {
            System.out.println("Its a prime no");
        }

    }
}

//24- 2*12,3*8, 4*6,//reverse 4*6,,3*8,2*12
