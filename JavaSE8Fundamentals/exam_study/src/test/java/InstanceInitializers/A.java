package InstanceInitializers;

/**
 * Copyright (c) 2016, 2017, Jumia.
 */
public class A {

    static int a = 0;
    static int b = 1;

    static {
        System.out.println(b);
    }

    public A(int value) {
        System.out.println(value);
    }

    public static void main(String args[]) {
        A a1 = new A(8);
    }
    static int c = 4;

    static {
        System.out.println(c);
    }
}
