package com.kun.code;

public class BonusSalaryIF {

    public static void main(String[] args) {
        int salary=20000;
        if(salary>1000){
            salary +=2000;
        }else if(salary>20000){
            salary+=30000;
        }
        else{
            salary=salary+1000;
        }
        System.out.println(salary);

    }
}
