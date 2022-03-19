package com.company;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {

        char character;
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        character = ch.next().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
            System.out.println(character + " is vowel");
        else if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
            System.out.println(character + " is vowel");
        else
            System.out.println(character + " is consonant");

    }
}
