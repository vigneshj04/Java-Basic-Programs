package com.company;

import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year : ");
        Scanner yr = new Scanner(System.in);
        year = yr.nextInt();
        if (year % 4 == 0) {
            System.out.println("Specified year is a leap year");
        } else
            System.out.println("Specified year is not a leap year");
    }
}

