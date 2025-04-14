
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class MathFunctions{
    public static int isPrimeOrComposite(String input) {
        try {
            int n = Integer.parseInt(input);
            if (n <= 1) return -1;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return 0;
            }
            return 1;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: Please enter a valid integer.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        int result = isPrimeOrComposite(input);

        if (result == 1)
            System.out.println("Prime");
        else if (result == 0)
            System.out.println("Composite");
        else
            System.out.println("Neither Prime nor Composite");

        scanner.close();
    }
}