package com.kun.subset;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Permutation {


    public static void main(String[] args) {
        ArrayList<String> str=permuatations("","abc");
        System.out.println(str);
    }

    static ArrayList<String> permuatations(String p, String up){

        if(up.isEmpty()){
            ArrayList al=new ArrayList();
            System.out.println(p);
            al.add(p);
            return al;
        }
        ArrayList<String> alr=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ArrayList<String> al= permuatations(first+ch+second,up.substring(1));
            alr.addAll(al);
        }
        return alr;
    }
}
