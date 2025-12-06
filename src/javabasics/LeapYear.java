package javabasics;

import java.util.Scanner;

public class LeapYear {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y>999 && y < 10000)
        {
            System.out.println("year is valid");
            if (y%4==0)
            {
                System.out.println("leap year");
            }
            else {
                System.out.println("not a leap year");
            }
        }
        else{
            System.out.println("invalid year");
        }
    }
}
