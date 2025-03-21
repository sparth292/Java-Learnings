import java.util.Scanner;

public class Demo2{
    public static void main(String[] args) {
        System.out.println("******** Code by Parth ********");
        
        Scanner scanner = new Scanner(System.in);
        
        // Initial account balance
        double balance = 5000.0;

        System.out.println("Current balance: " + balance);
        System.out.println("Choose transaction type:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Deposit
            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            
            if (depositAmount > 0) {
                balance += depositAmount;
                System.out.println("Deposit successful! Updated balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount. Please enter a positive value.");
            }

        } else if (choice == 2) {
            // Withdrawal
            System.out.print("Enter amount to withdraw: ");
            double withdrawalAmount = scanner.nextDouble();
            
            if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal successful! Updated balance: ₹" + balance);
            } else if (withdrawalAmount > balance) {
                System.out.println("Error: Insufficient balance.");
            } else {
                System.out.println("Invalid withdrawal amount. Please enter a positive value.");
            }

        } else {
            System.out.println("Invalid choice. Please select 1 for Deposit or 2 for Withdrawal.");
        }

        scanner.close();
    }
}
