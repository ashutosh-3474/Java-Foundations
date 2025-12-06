package javabasics;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter an alphabet:");
        char ch = sc.next().toLowerCase().charAt(0);

        // Checking vowel
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println(ch + " is a Vowel");
        }
        else {
            System.out.println(ch + " is a Consonant");
        }
    }
}
