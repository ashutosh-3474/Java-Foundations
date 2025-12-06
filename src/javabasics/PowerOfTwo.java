package javabasics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number n:");
        n = sc.nextInt();
        //Check for Valid value of n;
        if (n >= 0 && n < 31)
        {
            System.out.println("Valid Input");
            int cur = 1;
            for (int i=0;i<=n;i++)
            {
                System.out.println("2 ^ " + i + " = " + cur);
                cur = cur * 2;
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
