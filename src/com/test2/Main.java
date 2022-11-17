package com.test2;

public class Main {

    public static void main(String[] args) {

        /*String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));*/

        /*String str1 = ("abc");
        String str2 = ("abc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));*/

        /*String str1 = new String("ab") + new String("c");
        String str2 = new String("ab") + new String("c");
        System.out.println(str1.intern() == str2.intern());
        System.out.println(str1.equals(str2));*/

        String str1 = new String("ab") + new String("c");
        String str2 = new String("ab") + new String("c");
        System.out.println(str1 == str1.intern());
        System.out.println(str2.intern() == str1);

    }

}
