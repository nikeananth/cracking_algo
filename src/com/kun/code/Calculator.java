package com.kun.code;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
       int ans=0;

       while(true){
           char op=sc.next().trim().charAt(0);
           if(op=='+'||op=='-'||op=='*'||op=='%'){
               int num1=sc.nextInt();
               int num2=sc.nextInt();

               if(op=='+'){
                   ans=num1+num2;
               }
               if(op=='-'){
                   ans=num1-num2;
               }
               if(op=='*'){
                   ans=num1*num2;
               }
               if(op=='%'){
                   ans=num1%num2;
               }
           }else if(op=='X'){
               break;
           }
           System.out.println(ans);
           break;
       }

    }
}
