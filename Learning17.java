package com.company;

/*
* Receiving Input
*
* 1st Step :
*   import java.util.*;     -   Package
* 2nd Step :
*   Ask for value from user by system.out.println(" "), method
* 3rd Step :
*   Scanner sc = new Scanner(System.in)     -   Class
* 4th Step :
*   sc.nextInt(), sc.nextFloat()            -   Functions
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */
import java.util.*;

public class Learning17 {
    public static void main(String [] args){
        float p, r;
        double si;
        int t;
        System.out.println("Enter the Principal amount:");
        Scanner sc= new Scanner(System.in);
        p = sc.nextFloat();
        System.out.println("Enter the Rate of Interests:");
        Scanner ab= new Scanner(System.in);
        r = ab.nextFloat();
        System.out.println("Enter the desired time: ");
        Scanner ac= new Scanner(System.in);
        t = ac.nextInt();
        si= p*r*t/100;
        System.out.println("Value of Simple Interests for given inputs: "+ si);


    }
}
