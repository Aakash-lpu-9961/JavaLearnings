package com.company;

import java.io.*;

public class Learning14 {
    public static void main(String[] args) throws Exception
    {
//        Program to demonstrate the use of taking input from user by InputStreamReader method
        InputStreamReader isr;
        BufferedReader br;
        isr =new InputStreamReader(System.in);
        br = new BufferedReader(isr);
        float p, r, si;
        long n;
//        int a = b = c = d = 10;    It is not possible hence gives an error.
        System.out.println("Enter the value of p,r,n:");
        p = Float.parseFloat(br.readLine());
        r = Float.parseFloat(br.readLine());
        n = Integer.parseInt(br.readLine());
//        double a  = Math.pow(3.0,2.0);
        double b = Math.sqrt(9);
        double c = Math.sin(30);
        System.out.println("this is b: "+ b);
        System.out.println("this is c: "+ c);
        si = (n*p*r)/1000;
        System.out.println(si);

    }
}
