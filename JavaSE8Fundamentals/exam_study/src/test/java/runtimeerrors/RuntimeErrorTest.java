package runtimeerrors;

import org.junit.Test;

/**
 * Copyright (c) 2016, 2017, Jumia.
 */
public class RuntimeErrorTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_arraySizeZero_throwsArrayIndexOutOfBoundsException() {
        int [] a=new int[0];
        a[0]=5;
        System.out.println(a[0]);
    }
}
