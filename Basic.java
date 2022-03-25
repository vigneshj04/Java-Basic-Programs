package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        indexOfCh();
        count();
        countVowelAndConsonant();
        replace();
        primeNumber();
        maxTripletSum();
    }

    public static void indexOfCh() {
        String welcome = "Hi All, Welcome to Bridgelabz!";
        int index = welcome.indexOf("to");
        System.out.println(index);
    }

    public static void count() {
        String welcome = "Hi All, Welcome!";
        int count = 0;
        int i;
        for (i = 0; i < welcome.length(); i++) {
            if (welcome.charAt(i) != ' ')
                count = count + 1;
        }
        System.out.println("Total number of characters in a string: " + count);

    }

    public static void countVowelAndConsonant() {
        int vowel = 0;
        int consonant = 0;
        String welcome = "Hi All, Welcome to Bridgelabz!";
        welcome.toLowerCase();

        for (int i = 0; i < welcome.length(); i++) {
            if (welcome.charAt(i) == 'a' || welcome.charAt(i) == 'e' || welcome.charAt(i) == 'i' || welcome.charAt(i) == 'o' || welcome.charAt(i) == 'u') {
                vowel = vowel + 1;
            } else if (welcome.charAt(i) >= ' ')
                consonant = consonant + 1;
        }
        System.out.println("Number of Vowels: " + vowel);
        System.out.println("Number of Consonant: " + consonant);
    }

    public static void primeNumber() {
        System.out.println("Enter the maximum number : ");
        int number;
        int i;
        Scanner maxNum = new Scanner(System.in);
        int maximumNumber = maxNum.nextInt();
        for (number = 2; number <= maximumNumber; number++) {
            boolean isPrime = true;
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
                System.out.println(number);
        }
    }

    public static void replace() {
        String welcome = "Hi All, Welcome to Bridgelabz!";
        System.out.println(welcome.replaceAll(" ", "_"));

    }

    public static int maxTripletSum() {
        int sum = 0;
        int i = 0;
        int j = i + 1;
        int k = j + 1;
        int arr[] = {10, 9, 880, 68, 444, 2};
        int n = arr.length;
        for (i = 0; i < n - 3; i++) {
            for (j = i + 1; j <= n-2; j++) {
                for (k = j + 1; k <= n -1; k++) {
                    if (sum < arr[i] + arr[j] + arr[k]) {
                        sum = arr[i] + arr[j] + arr[k];
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        System.out.println(sum);
                    }
                }
            }
        }
        return sum;
    }
}
