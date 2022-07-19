package com.simplilearn.constructors;
public class arrayAssisted {

public static void main(String[] args) {

//single-dimensional array
int a[]= {5,10,15,20,25};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {10,8,6,4,2}, 
            {3, 6, 9} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}
