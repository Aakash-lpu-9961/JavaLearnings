package com.company;

//Day-1    DATA TYPES
/*
*
* Primitive Data Types -
*   Creates only in a Stack
*       Pre-Defined Data Types: Characters, Integers, Reals, Booleans
*       User-Defined Data Types: Enumerations
*
* Reference Data Types -
*   Created in Heaps
*       Pre-Defined Data Types: Objects, Strings
*       User-Defined Data Types: Classes, Arrays, Interfaces
*
* Size of the Data Types -
*
* Boolean   -   1 Byte,
* Char      -   2 Byte,     Ex - char x = 'A'
* Byte      -   1 Byte,
* Short     -   2 Byte,     Ex - short s = 10000, short r = -5000
* Int       -   4 Byte,     Ex - int a = 10000, int a = -20000
* Long      -   8 Bytes,    Ex - long a = 10100, long a = -20000
* Float     -   4 Byte,     Ex - float c = 234.5f
* Double    -   8 Byte,     Ex - double d1 = 12.3
*
* Rules for Declaring Variables Names
*   combination of      -   (_), ($), alphabets, digits
*   first character     -   alphabets, (_), ($)
*   no commas or blanks allowed within variable names.
*   case-sensitive : abc, ABC (both are different)
*
* convention for naming variables:
*   variables related to currency - starts with ($),  $interests
*   variables connecting multiple words use (_) - average_speed, averageSpeed
*
* There is no limit on maximum allowable length of variable name
*
* Keywords -  Reserved Words of Java Compiler.
*             Words which restricted for the use of naming variables
*             Total 48 Keywords in Java JVM
*
* NOTE:-
*   A Java Program is a collection of one or more packages.
*   Each packages contain multiple classes.
*   Each classes contain multiple functions.
*   Each functions contain multiple instructions.
*
*
*  */
public class Learning16 {
    public static void main(String[] args){
//        Program to calculate Simple Interests
        float p, roi,si;
        int n;
        p= 1000.5f;
        roi = 15.5f;
        n=3;
        si=n*p*roi/100;
        System.out.println("Simple Interests is :" + si);
    }
}
