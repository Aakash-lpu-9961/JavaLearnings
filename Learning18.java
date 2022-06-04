package com.company;
/*
* Type Casting In Java
*   Process that converts a data type into another data type manually and automatically
*   the automatic conversion is done by compiler and
*   the manual conversion is performed by the programmer.
*
*   double -> float -> long -> int -> short -> byte
*
*
* */
public class Learning18 {
    static int m = 100; // Static Variables
    static int method()
    {
        int n = 90; // Local Variable
        System.out.println("Local Variable : " + n);
        System.out.println("Static Variable : "+ m);
//        System.out.println("Instance Variable :" + main() );
        return n;
    }
    public static int main(String[] args)
    {

        int data = 50; //Instance Variable
        System.out.println("Instance Variable : " + data);
        System.out.println("Static Variable: " + m);
        System.out.println("Local Variable : "+ method() );

        method();
        return data;
    }



}
