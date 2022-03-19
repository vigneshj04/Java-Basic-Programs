package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the Number : ");
        Scanner value = new Scanner(System.in);
        number = value.nextInt();
        if (number % 2 == 0) {
            System.out.println("Entered Number is Even");
        } else {
            System.out.println("Entered Number is Odd");
        }
    }
}
