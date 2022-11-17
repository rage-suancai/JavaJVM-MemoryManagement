package com.test1;

public class Main {

    static int a() {
        return b();
    }

    static int b() {
        return c();
    }

    static int c() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    public static void main(String[] args) {

        int res = a();
        System.out.println(res);

    }

}
