package com.kun.subset;
import java.util.List;
import java.util.ArrayList;

public class Subset {


    public static void main(String[] args) {
       subset("","abc");
        subsetAscii("","abc");
        System.out.println(subsetAscii("","abc"));

        System.out.println(subsetIter(new int[]{1,1}));
        System.out.println(subsetIterDuplicate(new int[]{1,2,3,3}));


    }

    static  ArrayList<String> subset(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> ali=new ArrayList<>();
            System.out.println(p);
            ali.add(p);
            return ali;
        }

        char ch=up.charAt(0);
       ArrayList<String> as1= subset(p+ch,up.substring(1));
       ArrayList<String> as2= subset(p,up.substring(1));
       as1.addAll(as2);
       return as1;
    }


    static  ArrayList<String> subsetAscii(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> al=new ArrayList<>();
            System.out.println(p);
            al.add(p);
            return al;
        }

        char ch=up.charAt(0);
        ArrayList<String> as1= subsetAscii(p+ch,up.substring(1));
        ArrayList<String> as2= subsetAscii(p,up.substring(1));
        ArrayList<String> as3= subsetAscii(p+(ch+0),up.substring(1));
        as1.addAll(as2);
        as1.addAll(as3);
        return as1;
    }




    static  List<List<Integer>> subsetIter(int arr[]){
    List<List<Integer>> outer=new ArrayList<>();

    outer.add(new ArrayList<>());
    for(int num:arr) {
        int n = outer.size();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
            inner.add(num);
            outer.add(inner);
        }
    }
        return outer;
    }



    static  List<List<Integer>> subsetIterDuplicate(int arr[]){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++) {
            int start=0;
            int n = outer.size();
            int e=outer.size()-1;
            if(i>0&&arr[i]==arr[i-1]){
                start=e+1;
            }
            for (int j = start; j < n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }









}
