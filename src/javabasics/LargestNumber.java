package javabasics;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        // Compare and find largest
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest");
        }
        else if (b >= a && b >= c) {
            System.out.println(b + " is the largest");
        }
        else {
            System.out.println(c + " is the largest");
        }
    }
}
