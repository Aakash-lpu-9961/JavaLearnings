package com.company;
import java.util.Scanner;

public class Learning9 {
        public static void main(String... args){
            System.out.println("Hello World");
            Scanner sc = new Scanner(System.in);
            System.out.println("Program to demonstrate the use of Scanner");
            System.out.println("Enter number-1");
            int a = sc.nextInt();
            System.out.println("Enter number-2");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Result of Addition is: " + sum);
        }
}


