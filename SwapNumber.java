package com.company;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter the value for x : ");
        Scanner value = new Scanner(System.in);
        x = value.nextInt();

        System.out.println("Enter the value for y : ");
        y = value.nextInt();

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int swap = x;
        x = y;
        y = swap;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
