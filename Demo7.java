import java.util.Scanner;

public class Demo7{
    public static void main(String[] args) {
        System.out.println("******** Code by Parth ********");

        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();
        
        // Loop to print the table
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}
