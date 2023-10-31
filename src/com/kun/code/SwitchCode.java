package com.kun.code;

import java.util.Scanner;

public class SwitchCode {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        switch (name) {
            case "mango" -> System.out.println("mango is tasty");
            case "banana" -> System.out.println("banan is long");
            default -> System.out.println("default code");
        }
        Scanner sc1=new Scanner(System.in);
        int num=sc1.nextInt();

        switch (num) {
            case 1 -> System.out.println("No 1");
            case 2 -> System.out.println("No 2");
            default -> System.out.println("default code");
        }

    }
}
