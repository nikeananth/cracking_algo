package com.kun.maths;

public class sqrtNewton {

    public static void main(String[] args) {
        // Function calling
        System.out.println(squareRoot(50, 3));

        // Function calling
        System.out.println(squareRoot(10, 4));

        System.out.println(sqrt(50));
    }
    static float squareRoot(int number, int precision)
    {
        int start = 0, end = number;
        int mid;

        // variable to store the answer
        double ans = 0.0;

        // for computing integral part
        // of square root of number
        while (start <= end) {
            mid = (start + end) / 2;

            if (mid * mid == number) {
                ans = mid;
                break;
            }

            // incrementing start if integral
            // part lies on right side of the mid
            if (mid * mid < number) {
                start = mid + 1;
                ans = mid;
            }

            // decrementing end if integral part
            // lies on the left side of the mid
            else {
                end = mid - 1;
            }
        }

        // For computing the fractional part
        // of square root upto given precision
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= number) {
                ans += increment;
            }

            // loop terminates when ans * ans > number
            ans = ans - increment;
            increment = increment / 10;
        }
        return (float)ans;
    }


    static double sqrt(double n){
        double root;
        double x=n;
        while(true){
            root=0.5 * (x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;

        }
return  root;

    }

}
