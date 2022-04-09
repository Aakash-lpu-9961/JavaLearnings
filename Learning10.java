package com.company;
import java.util.Scanner;

public class Learning10 {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find the Simple Interest");
        System.out.println("Enter the, initial principal balance:");
        int a = sc.nextInt();
        System.out.println("Enter the, annual Interest rate:");
        int b = sc.nextInt();
        System.out.println("Enter the time in yrs:");
        int c = sc.nextInt();
        int simple_interest = a*(1 + b*c);
        System.out.println("Simple Interest = ");
        System.out.println(simple_interest);
        System.out.println("This is an Simple Interest Calc.");
        String str = sc.next();
        System.out.println(str);
//        String str1 = sc.nextLine();
//        System.out.println(str1);

    }
}
