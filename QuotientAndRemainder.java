package com.company;
import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        int dividend;
        int divisor;
        /* double dividend;
           double divisor; */


        System.out.println("Enter the Dividend :");

        Scanner year = new Scanner(System.in);
        dividend = year.nextInt();

        System.out.println("Enter the Divisor :");
        divisor = year.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }

}
