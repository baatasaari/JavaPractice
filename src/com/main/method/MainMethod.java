package com.main.method;

public class MainMethod {
    static int x;
    static int y = 20;
    /*
     * whether class contains main() method or not,
     * whether main() is declared or not,
     * these won't be consider by compiler.
     *
     * At RunTime JVM, is responsible to check these things, if JVM unable to find main() it throws exception such as
     * Error: Main method not found in class com.main.method.MainMethod, please define the main method as:
     * public static void main(String[] args)
     * or a JavaFX application class must extend javafx.application.Application
     *
     * JVM will check main method sytax as same as below
     * */

    public static void main(int[] args) {
        System.out.println("---int array args---");
    }

    public static void main(char[] args) {
        System.out.println("---char array args---");
    }

    /*
     *The arguments which are passing from command prompt are called command line arguments and with ththese
     *JVM will create an array and pass those array as argument and JVM will call main() method
     *
     *- The Main objective of command line arguments is we can customize the behaviour of main method
     * */
    public static void main(String[] args) {
        System.out.println("---String array args---"+args.length);
        //System.out.println("--args[0]---"+args[2]);
        for(String value : args) {
            System.out.println("---command line arguments---"+value);
        }
        /*
         * public - to call this method by JVM from anywhere in the machine
         * static - without existing an object, jvm has to call this method
         * void - this method doesn't return anything.
         * main - it is an identifier defined by SUN
         * String[] args - we can pass any type of data to main method from command line arguments.
         *
         * */

        /*
         * Above syntx is strict but still we can make few changes.
         * - public static can be inter changeable.
         *   static public void main(String[] args)
         * - we can change String array format.
         *   public static void main(String []args)
         *   public static void main(String args[])
         * - We can define any identifier name for String[] variable.
         *   public static void main(String[] suneetha)
         * - We can replace String[] wit var- arg param
         *   public static void main(String... args)
         * */

        /*
         * We can declared main() with following modifiers such
         *
         * final, synchronized, strictfp
         * */

        /*
         * which of the following main()method declarations are valid.
         * public static void main(String args) (invalid)
         * public static void Main(String[] args) (invalid)
         * public void main(String[]  args) (invalid)
         * public static int main(String[] args) (invalid)
         * final synchronized strictfp public void main(String[]  args) (invalid)
         * final synchronized strictfp public static void main(String[]  args) (valid)
         * public static void main(String... args) (valid)
         * */

        /*
         * Overloading of main() method is possible but jvm will always execute (String[] args ) parameterized main() only.
         * the Other overloaded methods has to be called explicitly like a normal methods
         *
         * */

        /*
         * Enhancements in main() :-
         * untill 1.6v, if the class donesn't contains main() method then we will get RTE : NoSUch MethodError:mina()
         * But from 1.7v onwards, instead of above error, we get elaborated error information
         * */

        /*
         * Static block execute before main(String[]  args) method.
         * - 1.6v, static block will execute and then we get error when main() method is not defined.
         * - 1.7v, main() should be define to execute static block
         * */
    }

    static {
        System.out.println("---Static Block---");
    }

}
