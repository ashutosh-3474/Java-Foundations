package javabasics;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //input number from user
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        boolean isFirst = true; // to handle * placement correctly

        //print number of times the number is divisible by 2
        while(n % 2 == 0)
        {
            if (!isFirst) System.out.print("*");
            System.out.print(2);
            isFirst = false;
            n = n / 2;
        }

        //check for odd numbers for 3 to sqrt(n)
        for (int i=3;i*i<=n;i++)
        {
            while(n % i == 0)
            {
                if(!isFirst) System.out.print("*");
                System.out.print(i);
                isFirst = false;
                n = n / i;
            }
        }

        //check for the left prime
        if (n > 2)
        {
            if(!isFirst) System.out.print("*");
            System.out.print(n);
        }
    }
}
