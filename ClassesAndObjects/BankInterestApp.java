
class Bank {
    double principal;
    double rate;
    int time;

    Bank(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void bankDetails() {
        System.out.println("Welcome to Parth's Bank!");
    }
}

// Parent interface
interface Interest {
    void calculateInterest();
}

// Child class inheriting from Bank and implementing Interest
class Loan extends Bank implements Interest {
    Loan(double principal, double rate, int time) {
        super(principal, rate, time);
    }

    // Implementing the method from the Interest interface
    public void calculateInterest() {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

// Main class
public class BankInterestApp {
    public static void main(String[] args) {
        Loan loan = new Loan(10000, 5, 3); // Example: Principal=10000, Rate=5%, Time=3 years
        loan.bankDetails();         // Method from Bank class
        loan.calculateInterest();   // Method from Interest interface
    }
}
