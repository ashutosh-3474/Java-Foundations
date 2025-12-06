package javabasics;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        //Input value of n from the user
        System.out.println("Enter the value of n:");
        n = sc.nextInt();

        //Validation check for n, must not be equal to zero
        if (n > 0)
        {
            //variable to store the sum of the harmonic series
            double sum = 0;
            //loop to print each term
            for (int i=1;i<n;i++)
            {
                System.out.print("1/" + i + " + ");
                sum = sum + (1.0 / i); //add the term to sum
            }
            //print last term separately
            System.out.print("1/" + n + " = ");
            sum = sum + (1.0 / n); // add nth term

            //print the final harmonic value
            System.out.println(sum);
        }
        else
        {
            //message for invalid input
            System.out.println("Invalid Imput");
        }

    }
}
