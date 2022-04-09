package com.company;
import java.util.Scanner;

public class Learning12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to demonstrate the use of Strings");
        String name = new String("My Name Is Aakash Kumar");
        System.out.println("What is your name: "+ name);
        System.out.print("What is your Current Address: ");
        String add = sc.nextLine();
        System.out.println("Your Address is : "+ add);
        System.out.println("Is it Correct, Press 1 for Ok & 2 for No");
        int a = sc.nextInt();
        if (a == 1){
            System.out.print("Happy Coding !!!");
        }
        else {
            System.out.print("Sorry...");
        }

    }
}
