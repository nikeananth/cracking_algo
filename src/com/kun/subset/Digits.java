package com.kun.subset;

import java.util.ArrayList;

public class Digits {

    public static void main(String[] args) {

        pad("","123");
        ArrayList<String> padlst= padList("","123");
        System.out.println(padlst);
    }


    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit=up.charAt(0)-'0';

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }


    static ArrayList<String> padList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(p);
            return arr;
        }

        int digit=up.charAt(0)-'0';
        ArrayList<String> arrLst=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
           ArrayList<String> arrayList= padList(p+ch,up.substring(1));
            arrLst.addAll(arrayList);
        }
        return arrLst;
    }
}
