package com.mycompany.mavenproject1;

import java.util.Scanner;

public class MathTwoInput {

    public static int findLCM(String a, String b) {
        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            int gcd = findGCD(num1, num2);
            return Math.abs(num1 * num2) / gcd;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: Please enter valid integers.");
        }
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return Math.abs(num1);
    }

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String a = scanner.nextLine();
        System.out.print("Enter second number: ");
        String b = scanner.nextLine();
        System.out.println("LCM: " + findLCM(a, b));
        scanner.close();
    }
}
