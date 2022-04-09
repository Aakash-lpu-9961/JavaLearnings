package com.company;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Learning13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Address:");
        String add = sc.nextLine();
        System.out.println("Entered Address is: "+ add);
        System.out.println(add.length());
        System.out.println(add.toLowerCase());
        System.out.println(add.toUpperCase());
        String name = sc.nextLine();
        System.out.println("     My Name Is :    " + name);
        System.out.println(name.trim());

    }
}
