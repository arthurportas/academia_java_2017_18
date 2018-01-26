package compilationerror;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Copyright (c) 2016, 2017, Jumia.
 */
public class CompilationErrorTest {

    /**
     * {@see https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.12.4}
     * {@see https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.11}
     *
     * */
    @Test
    public void test_switchCase_constantComparison_Success() {

        final int x = 0; //success
      //  x = 0;
        final int y = 2;

        int i = (int)(Math.random() * 4);

        switch (i){
            case x:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 4:
                System.out.println("D");
                break;
            case y:
                System.out.println("C");
        }
    }

    @Test
    @Ignore
    public void test_switchCase_constantComparison_compilationError() {
//        final int x;
//        x = 0;
//        final int y = 2;
//
//        int i = (int)(Math.random() * 4);
//
//        switch (i){
//            case x:
//                System.out.println("A");
//                break;
//            case 1:
//                System.out.println("B");
//                break;
//            case 4:
//                System.out.println("D");
//                break;
//            case y:
//                System.out.println("C");
//        }

//        final int x;
//        //    x = 0;
//        final int y = 2;
//
//        int i = (int)(Math.random() * 4);
//
//        switch (i){
//            case x:
//                System.out.println("A");
//                break;
//            case 1:
//                System.out.println("B");
//                break;
//            case 4:
//                System.out.println("D");
//                break;
//            case y:
//                System.out.println("C");
//        }
    }
}