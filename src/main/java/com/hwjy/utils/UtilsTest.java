package com.hwjy.utils;

import java.util.Arrays;
import java.util.List;

public class UtilsTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("1peter", "2anna", "3mike", "4xenia");
        names.sort((a,b)->a.compareTo(b));
        System.out.println("Result===" + names.toString());
//        Result===[xenia, peter, mike, anna] (a,b)->b.compareTo(a)
//        Result===[anna, mike, peter, xenia] (a,b)->a.compareTo(b)
        String testStr = "nihao你好";
        byte b = (byte)128;
        System.out.println("b=" + b);
    }

}
