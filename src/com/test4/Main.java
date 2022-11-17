package com.test4;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        long address = unsafe.allocateMemory(4);
        unsafe.putInt(address, 6666666);
        System.out.println(unsafe.getInt(address));
        unsafe.freeMemory(address);
        System.out.println(unsafe.getInt(address));

    }

}
