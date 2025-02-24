import java.util.Scanner;

public class Demo3{
    public static void main(String[] args) {
        System.out.println("******** Code by Parth ********");
        
        Scanner scanner = new Scanner(System.in);

        // Taking input for gender and policy amount
        System.out.print("Enter gender (Male/Female): ");
        String gender = scanner.next().toLowerCase();  // Converting input to lowercase for easy comparison
        
        System.out.print("Enter policy amount: ");
        double policyAmount = scanner.nextDouble();

        double bonus;

        // Calculating bonus based on gender and policy amount
        if (gender.equals("male")) {
            bonus = policyAmount * 0.02;  // 2% bonus for male
        } else if (gender.equals("female") && policyAmount > 50000) {
            bonus = policyAmount * 0.05;  // 5% bonus for female with policy amount > 50000
        } else {
            bonus = policyAmount * 0.025; // 2.5% bonus for female with policy amount ≤ 50000
        }

        // Displaying the bonus
        System.out.println("Bonus amount: " + bonus);

        scanner.close();
    }
}
