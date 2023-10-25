package com.kun.code;

import java.util.Scanner;

public class ScannerCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature");
        float tempc = sc.nextFloat();
        float tempf = (tempc * 9 / 5) + 32;
        System.out.println(tempf);

    }
}
