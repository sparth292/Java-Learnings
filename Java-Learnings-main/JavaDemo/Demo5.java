import java.util.Scanner;

public class Demo5{
    public static void main(String[] args) {
        System.out.println("******** Code by Parth ********");
        
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for marks
        System.out.print("Enter the marks (0 - 100): ");
        int marks = scanner.nextInt();

        // Checking the range and assigning grades
        if (marks >= 80 && marks <= 90) {
            System.out.println("Grade: Distinction");
        } else if (marks >= 60 && marks <= 79) {
            System.out.println("Grade: First Class");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: Second Class");
        } else if (marks >= 40 && marks <= 49) {
            System.out.println("Grade: Third Class");
        } else if (marks >= 0 && marks <= 39) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks. Please enter a number between 0 and 100.");
        }

        scanner.close();
    }
}
