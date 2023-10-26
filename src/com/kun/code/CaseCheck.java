package com.kun.code;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        char c=sc.next().trim().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("lowecase");
        }
        else {
            System.out.println("UpperCase");
        }

    }
}
