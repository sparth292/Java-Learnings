import java.util.Scanner;

public class Demo4{
    public static void main(String[] args) {
        System.out.println("******** Code by Parth ********");
        
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Checking if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even.");
        } else {
            System.out.println("The number " + number + " is Odd.");
        }

        scanner.close();
    }
}
