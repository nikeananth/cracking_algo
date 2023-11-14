package com.kun.search1;

public class LinearSearchString {
    public static void main(String[] args) {
        System.out.println((search("vijay", 'j')));
    }

    static boolean search(String str, char target) {

        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]==target){
                System.out.println(ch[i]);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}

