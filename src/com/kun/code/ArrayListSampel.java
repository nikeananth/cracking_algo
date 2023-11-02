package com.kun.code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSampel {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);

        System.out.println(list);


        ArrayList<ArrayList<Integer>> lst=new ArrayList<>();
        for(int i=0;i<3;i++){
            lst.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                lst.get(i).add(j);
            }
        }

        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
        }



    }
}
