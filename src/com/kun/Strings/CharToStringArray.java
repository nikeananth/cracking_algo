package com.kun.Strings;

import java.util.ArrayList;

public class CharToStringArray {

    public static void main(String[] args) {

      String series="";
      for(int i=0;i<26;i++){
          char ch=(char)('a'+i);
          series=series+ch;
      }
        System.out.println(series);



        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb);

    }
        }


