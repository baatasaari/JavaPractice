package com.ArraysConcepts;

public class ArraysConcepts {

	public static void main(String[] args) {
      /*
       * Array -> is an Indexed based collection of fixed no of homogeneous data elements
       * - Main advantage, we can represent multiple values of same type in a single variable
       * - Limitation, once we create array, we can expand its size.
       * - Performance wise faster.
       * - We can overcome this problems using collections concept.
       * */
		
		/* Array Declaration
		 * Single dimensions array -
		 * 
		 * int[] a; (recommended approach)
		 * int []a;
		 * int a[];
		 * all the three approaches are valid.
		 * 
		 * int[5] a; (we can't specify size at the time of declaration)
		 * 
		 * */
		
		/*
		 * 2D Array -
		 * int[][] a; ((recommended approach))
		 * int [][]a;
		 * int a[][];
		 * int[] []a;
		 * int []a[];
		 * int a[][]; 
		 * */
		
		/*
		 * 3D Array -
		 * int[][][] a;
		 * int a[][][];
		 * int [][][]a;
		 * int[] [][]a;
		 * int[] []a[];
		 * int[] a[][];
		 * int[][] []a;
		 * int[][] a[];
		 * int [][]a[];
		 * int []a[][]; 
		 * 
		 * */

		/*
		 * Which of the following are valid declarations
		 * a) int[] a,b; a->1, b->1
		 * b) int[] a[],b; a ->2, b->1
		 * c) int[] []a,b; a ->2, b->2
		 * d) int[] []a,b[]; a ->2, b->3
		 * e) int[] []a,b[],c[]; a->2, b->3, c->3 
		 * d) int[] []a,[]b; (invalid)
		 * 
		 * in case of e) when we have multiple variable for arrays, 
		 * array should be allowed left side of first element that []a
		 * array should not be allowed left side of second or more but right side is valid b[], c[]
		 * */
		
		/*
		 * Array Construction :-
		 * Every array is an Java object and hence we can create by using new operator.
		 * At the time of array creation, we need to define its size otherwise we have compile time errors
		 * */
		byte[] b = new byte[2];
		short[] s = new short[3];
		int[] a = new int[4];
		long[] l = new long[5];
		float[] f = new float[6];
		double[] d = new double[7];
		char[] c = new char[8];
		boolean[] bl = new boolean[9];
		
		// Every array has its corresponding classes, which are not available for programmer level.
		// if we print class object, it prints in format as classname@hashcode in hexadecimal form
		
	   System.out.println("--byte array class name--"+b);
	   System.out.println("--short array class name--"+s);
	   System.out.println("--int array class name--"+a);
	   System.out.println("--long array class name--"+l);
	   System.out.println("--float array class name--"+f);
	   System.out.println("--double array class name--"+d);
	   System.out.println("--char array class name--"+c);
	   System.out.println("--bl array class name--"+bl);
	   
	   //negative size shouldn't be declared, otherwise we get NegativeArraySizeException
	   //int[] negSize = new int[-5];
	   
	   /*
	    * examples -
	    * a) int[] a = new int['a'];
	    * b) byte b = 25;
	    *    int[] a = new int[b];
	    * c) short s = 125;
	    *    int[] a = new int[s];
	    * d) int[] a = new int[5];
	    * e) int[] a = new int[10L]; (invalid cannot convert long to int)
	    * f) int[] a = new int[10.5]; (invalid connot conver double to int)
	    * 
	    * 
	    * */
	   int[] aChar = new int['a'];
	   System.out.println("---aChar.length----"+aChar.length);
	   byte by = 25;
	   int[] byteConv = new int[by];
	   System.out.println("---byteConv.length----"+byteConv.length);
	   
	   //Maximum allowed array size in 2^32
	   
	   
	   /*
	    * Array of Arrays concept.
	    * 2D Arrays -
	    * int[][] x = new int[5][6]; - Matrix form
	    * Java, array concept is not implemented in matrix form, but it implemented in array of array concept.
	    * 
	    * int[][] y = new int[3][];
	    *  y[0] = {20,30,40};
	    *  y[1] = new int[4];
	    *  y[2] = new int[2];
	    * */
	   int[][] x = new int[5][6]; 
	   int[][] y = new int[3][];
	    y[0] = new int[]{20,30,40};
	    y[1] = new int[4];
	    y[2] = new int[]{60,70};
	    System.out.println("---printing 20 value----"+y[0][0]);
	    System.out.println("---printing 40 value----"+y[0][2]);
	    System.out.println("---printing 70 value----"+y[2][1]);
	    
	    
	    /*
	     * example : 
	     * 
	     * int[] a = new int[]; (invalid, must specify its size)
	     * int[] a = new int[4]; (valid)
	     * int a = new int[5]; (invalid)
	     * int a[][] = new int[][]; (invalid)
	     * int a[[]] = new int[3][]; (valid, array of arrays concept)
	     * int a[][] = new int[][3]; (invalid)
	     * int[][] a = new int[3][5]; (valid)
	     * int[][][] a = new int[3][5][6]; (valid)
	     * int[][][] a = new int[4][][]; (valid)
	     * int[][][] a = new int[3][4][]; (valid)
	     * int[][][] a = new int[3][][5]; (invalid)
	     * int[][][] a = new int[][4][5]; (invalid)
	     * 
	     * */
	    
	    /* 
	     * Array Initialization
	     * - Once array created it will initialized with its default values applicable for 1D arrays. 
	     * */
	    
	    int[] in = new int[3];
	    System.out.println("--0---"+in[0]);
	    System.out.println("---1--"+in[1]);
	    System.out.println("---2--"+in[2]);
	    System.out.println("--print in---"+in); //className@hashcode in hexa decimal form
	    
	    
	    /*
	     * Performing operation on null
	     * */
	    int[][] npe = new int[2][];
	    System.out.println("-----npe-1----"+npe[0]);
	    System.out.println("-----npe-2----"+npe[1]);
	    //System.out.println("-----npe-3----"+npe[0][0]); //Occurs NPE
	    
	    
	    /*Array Declaration, Creation and Initialization in single line*/
		/*
		 * int[] dec; 
		 * dec = new int[2]; 
		 * dec[0] = 1; 
		 * dec[1] = 5;
		 */
	    
	    int[] dec = new int[] {1,5};
	    System.out.println("---array length---"+dec.length);
	    
	    int[][] dec2D = new int[][] {{12,20},{20,30,40}}; 
	    
	    int[][][] dec3D = new int[][][] {{{2,3,4},{4,6,7}},{{8,9},{10,11,12}}};
	    
	    System.out.println("---dec3D- 8--"+dec3D[1][0][0]);
	    System.out.println("---dec3D- 12--"+dec3D[1][1][2]);
	    
	    /*
	     * Difference b/w length and length()
	     * 
	     * length - is final variable applicable only for arrays to represent it size()
	     * int[] a = new int[5];
	     * a.length; // 5
	     * a.length(); //cannot find symbol
	     * 
	     * length() - is a final method applicable only for String objects and to represent no of character present in String
	     * String name = "JavaClass";
	     * name.length(); //9
	     * */
	    int[] len = new int[5];
	    System.out.println("---int--"+len.length); // 5
	    String[] Strlen = new String[5];
	    System.out.println("---str--"+Strlen.length); 
	    
	    String name = "Java Class";
	    System.out.println(name.length()); //9
	    
	    /*
	     * examples : 
	     * */
	    String[] sArr = {"k","kk","kkk"};
	    System.out.println("---sArr.length---"+sArr.length);
	    System.out.println("---sArr[0].length()---"+sArr[0].length());
	    System.out.println("---sArr[1].length()---"+sArr[1].length());
	    System.out.println("---sArr[2].length()---"+sArr[2].length());
	    
	}

}
