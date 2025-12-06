package javabasics;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //input for the user
        System.out.println("enter dividend");
        int dividend = sc.nextInt();

        System.out.println("enter divisor");
        int divisor = sc.nextInt();

        //calculate quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        //print result
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
