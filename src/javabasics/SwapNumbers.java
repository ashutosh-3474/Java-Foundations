package javabasics;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input numbers
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // swapping using temp
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
