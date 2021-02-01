package com.vararg.methods;

public class VariableArgumentMethod {


    public static void main(String[] args) {

        /*
         * Variable argument methods -
         * We can declare a method we we can pass variable no of arguments, such type of methods are var-arg methods
         * - Internally it convert var-arg method as array
         * void m1(int...x){};
         * void m1(int ...x){};
         * void m1(int... x){};
         * */

        System.out.println(sum(10,20,30,50,25));
        System.out.println(sum(10,20));
        System.out.println(sum(10));
        System.out.println(sum());
        System.out.println(sum1(100,1,2,3,5));
        System.out.println(sum2("Total Amount",12.50,25.50,36.52));
        m1(10);
        System.out.println(sum1(100,new int[] {10,20,30})); //Anonymous array
        sum2D(new int[][] {{10,20}});
    }

    static int sum(int...x) {
        int total = 0;
        for(int a : x) {
            total = total + a;
        }
        return total;
    }

    /*
     * which are the following are valid
     * m1(int[] x)  -> m1(int... x)
     * m1(int []x)  -> m1(int ...x)
     * m1(int x[]) -> m1(int...x) (compiles fine without spaces)
     *
     * m1(int x...) (invalid)
     * m1(int. ..x) (invalid)
     * m1(int  .x..)(invalid)
     *
     * */

    /*
     * - we can add extra parameter with var-arg methods
     * - in this case, we have use var-arg method at end of all parameters
     * - we cannot use more than one var-arg parameter in method
     *
     * */
    static int sum1(int b, int...x) {
        int total = 0;
        for(int a : x) {
            total = total + a;
        }
        return total + b;
    }

    static String sum2(String name, double...x) {
        double t = 0;
        for(double a : x) {
            t = t + a;
        }
        return name+"-->"+t;
    }

    static void m1(int... x) { //introduced in 1.5v
        System.out.println("---Var Arg Method--");
    }

    static void m1(int y) { //introduced in 1.0v
        System.out.println("---Int Method--");
    }

    static void sum2D(int[]...x) {
        System.out.println("---x[][]---"+x[0][0]);
    }
}
