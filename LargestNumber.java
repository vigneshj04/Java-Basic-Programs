package com.company;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        double X, Y, Z;

        Scanner Check = new Scanner(System.in);
        System.out.println("Enter the value for X: ");
        X = Check.nextDouble();

        System.out.println("Enter the value for Y: ");
        Y = Check.nextDouble();

        System.out.println("Enter the value for Z: ");
        Z = Check.nextDouble();

        if (X >= Y) {
            if (X >= Z)
                System.out.println("X = " + X + " is the largest number.");
            else
                System.out.println("Z = " + Z + " is the largest number.");
        } else {
            if (Y >= Z)
                System.out.println("Y = " + Y + " is the largest number.");
            else
                System.out.println("Z = " + Z + " is the largest number.");
        }

    }
}
