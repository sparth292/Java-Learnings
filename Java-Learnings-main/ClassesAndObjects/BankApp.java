import java.util.Scanner;

class Account {
    int accNo;
    float accBal;

    Account(int ano, float bal) {
        accNo = ano;
        accBal = bal;
    }

    void display() {
        System.out.println("Account No: " + accNo + "\nBalance: " + accBal);
    }
}

class Savings extends Account {
    float roi, years;

    Savings(int ano, float bal, float r, float y) {
        super(ano, bal);
        roi = r;
        years = y;
    }

    void deposit(float amt) { accBal += amt; }
    void withdraw(float amt) { accBal -= amt; }
    float calculateInterest() { return (accBal * roi * years) / 100; }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Savings acc = new Savings(1011, 1500, 2.3f, 5);

        System.out.println("1.Deposit\n2.Withdraw");
        if (s.nextInt() == 1) acc.deposit(100);
        else acc.withdraw(100);

        System.out.println("Interest: " + acc.calculateInterest());
        acc.display();
    }
}
