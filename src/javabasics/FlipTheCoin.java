package javabasics;

import java.util.Scanner;

public class FlipTheCoin {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int t = 0;
        int h = 0;
        System.out.println("enter number of flips");
        n = sc.nextInt();
        if(n >= 0)
        {
            System.out.println("entered a positive number");
        }
        else {
            System.out.println("entered a negative number");
            System.exit(0);
        }

        for (int i=0;i<n;i++)
        {
            double genrate = Math.random();
            System.out.println(genrate);
            if (genrate < 0.5)
            {
                h++;
            }
            else t++;
        }

        System.out.println(h);
        System.out.println(t);

        double head = (double)h/n*100;
        double tail = (double)t/n*100;

        System.out.println("head percentage is "+ head);
        System.out.println("tail percentage is "+ tail);

    }
}
