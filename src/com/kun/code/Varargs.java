package com.kun.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        func(1,2,3,4,5,6);
    }

    static void func(int ...arg){
        System.out.println(Arrays.toString(arg));
    }
}
