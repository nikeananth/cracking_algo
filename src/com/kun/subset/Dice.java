package com.kun.subset;

import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {

        dice("",4);
        System.out.println(diceArrLst("",4));
    }


    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for(int i=1;i<=6&&i<=target;i++){
            dice(p+i,target-i);
        }
    }

    static   ArrayList<String> diceArrLst(String p,int target){
        if(target==0){
            ArrayList<String> arrayList=new ArrayList<>();
            arrayList.add(p);
            return arrayList;
        }
        ArrayList<String> arrayList=new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){
            ArrayList<String> arrayListret = diceArrLst(p+i,target-i);
            arrayList.addAll(arrayListret);
        }
       return arrayList;
    }
}
