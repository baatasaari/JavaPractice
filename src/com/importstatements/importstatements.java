package com.importstatements;

import java.util.ArrayList;
import java.util.Date;

import static java.lang.Math.sqrt;

/*
 * Two types of imports -
 * Explicit import
 * Implicit Import
 * */
//Explicit import - it is highly recommended to use explicit class import, it improves readability of code
//Implicit Import  - it is not recommended to use implicit class import, it reduces readability of code
/*
 * in some cases, two packages may contains same class, in that we get ambiguity error's
 * */
//import java.sql.Date;

    class ImportStatements {

        public static void main(String[] args) {
            ArrayList ll = new ArrayList();
            Date todays = new Date();

            /*
             * ex :
             *  import java.util.LinkedList;  (valid)
             *  import java.util.ArrayList.*; (invalid)
             *  import java.util.*; (valid but not recommended)
             *  import java.util; (invalid)
             *
             * */

            /*
             * java.util.ArrayList ll = new java.util.ArrayList();
             * This is fully qualified import statement, but fully qualified names are not recommended to use
             * */

            /*
             * ex :
             * import java.*;
             * import java.util.*;
             * import java.util.regex.*;
             * */

            /*
             * All classes and interfaces present in following packages are by default available to every java  class
             * - java.lang
             * - Current Working directory
             * */

            // -java.lang pkg
            String str = new String("Java Class");
            StringBuffer sb = new StringBuffer("Sb Class");

            /*
             * import statement is totally compile time related concept,
             * so more no of import then more time will take to compile but there no effect on run time execution
             *
             * */

            System.out.println(sqrt(16));
            System.out.println(sqrt(25));

            /*
             * explain about System.out.println();
             * */
            System.out.println();
            ImportStatements.s.length();
        }

        static String s = "Java";

        /*
         * static int sqrt(int n) {
         * System.out.println("----current class static method---"); return sqrt(n); }
         */

        /*
         * Syntax :
         * Normal import :
         *  explicit import -
         *   - import packageName.className
         *   - import packageName.subpackage.className
         *   eg : import java.util.ArrayList
         *  Implicit import
         *   - import packageName.*
         *   - import packageName.subpackage.*
         *   eg : import java.util.*
         *
         * Static import
         *  explicit import -
         *   - import static packageName.className.staticmembers
         *   - import packageName.subpackage.className.staticmembers
         *   eg : import static java.lang.Math.sqrt;
         *  Implicit import
         *   - import static packageName.className.*
         *   - import packageName.subpackage.className.*
         *   eg : import static java.lang.Math.*;
         * */

    }