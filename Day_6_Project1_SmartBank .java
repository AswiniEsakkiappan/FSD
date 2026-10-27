
package Day_6;

import java.util.Scanner;
import java.time.LocalDateTime;

abstract class BankAccount {

    private String accountNumber;
    private String name;
    private int pin;
    private double balance;

    private String[] transactions = new String[100];
    private int transactionCount = 0;

    public BankAccount(String accountNumber, String name, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.pin = pin;
        this.balance = balance;

        addTransaction("Account created: Rs." + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean authenticate(int enteredPin) {
        return pin == enteredPin;
    }

    protected void updateBalance(double amount) {
        balance = amount;
    }

    public void addTransaction(String details) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount] =
                    details + " | Balance: Rs." + balance
                    + " | " + LocalDateTime.now();

            transactionCount++;
        }
    }

    public void deposit(double amount) {
        deposit(amount, "Cash deposit");
    }

    public void deposit(double amount, String description) {
        if (!Double.isFinite(amount) || amount <= 0
                || !Double.isFinite(balance + amount)) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        updateBalance(balance + amount);
        addTransaction("Deposit: Rs." + amount + " | " + description);
        System.out.println("Deposit successful.");
    }

    public abstract boolean withdraw(double amount);

    public abstract String getAccountType();

    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Account Type: " + getAccountType());
    }

    public void showTransactions() {
        System.out.println("\n===== TRANSACTION HISTORY =====");

        if (transactionCount == 0) {
            System.out.println("No transactions available.");
            return;
        }

        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String number, String name, int pin, double balance) {
        super(number, name, pin, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (getBalance() - amount < 1000) {
            System.out.println("Minimum balance of Rs.1000 is required.");
            return false;
        }

        updateBalance(getBalance() - amount);
        addTransaction("Withdrawal: Rs." + amount);
        System.out.println("Withdrawal successful.");

        return true;
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String number, String name, int pin, double balance) {
        super(number, name, pin, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0 || amount > 50000) {
            System.out.println("Invalid amount. Withdrawal limit is Rs.50000.");
            return false;
        }

        if (getBalance() - amount < 500) {
            System.out.println("Minimum balance of Rs.500 is required.");
            return false;
        }

        updateBalance(getBalance() - amount);
        addTransaction("Withdrawal: Rs." + amount);
        System.out.println("Withdrawal successful.");

        return true;
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }
}

public class SmartBank {

    static Scanner sc = new Scanner(System.in);
    static BankAccount[] accounts = new BankAccount[100];
    static int accountCount = 0;
    static int nextAccount = 1001;

    static BankAccount findAccount(String number) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(number)) {
                return accounts[i];
            }
        }

        return null;
    }

    static BankAccount authenticateAccount() {
        System.out.print("Enter account number: ");
        String number = sc.next();

        BankAccount account = findAccount(number);

        if (account == null) {
            System.out.println("Account not found.");
            return null;
        }

        System.out.print("Enter 4-digit PIN: ");
        String pinText = sc.next();

        if (!pinText.matches("[0-9]{4}")) {
            System.out.println("PIN must contain exactly 4 digits.");
            return null;
        }

        if (!account.authenticate(Integer.parseInt(pinText))) {
            System.out.println("Incorrect PIN.");
            return null;
        }

        return account;
    }

    static void createAccount() {
        if (accountCount >= accounts.length) {
            System.out.println("Account storage is full.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter customer name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Set a 4-digit PIN: ");
        String pinText = sc.next();

        if (!pinText.matches("[0-9]{4}")) {
            System.out.println("PIN must contain exactly 4 digits.");
            return;
        }

        int pin = Integer.parseInt(pinText);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Select account type: ");
        int type = sc.nextInt();

        if (type != 1 && type != 2) {
            System.out.println("Invalid account type.");
            return;
        }

        double minimum = (type == 1) ? 1000 : 500;

        System.out.print("Enter initial deposit: Rs.");
        double amount = sc.nextDouble();

        if (!Double.isFinite(amount) || amount < minimum) {
            System.out.println("Minimum initial deposit is Rs." + minimum);
            return;
        }

        String number = "SB" + nextAccount++;

        if (type == 1) {
            accounts[accountCount] =
                    new SavingsAccount(number, name, pin, amount);
        } else {
            accounts[accountCount] =
                    new CurrentAccount(number, name, pin, amount);
        }

        accountCount++;

        System.out.println("\nAccount created successfully!");
        System.out.println("Your account number is: " + number);
        System.out.println("Please remember your account number and PIN.");
    }

    static void depositMoney() {
        System.out.print("Enter account number: ");
        BankAccount account = findAccount(sc.next());

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter deposit amount: Rs.");
        double amount = sc.nextDouble();

        account.deposit(amount);
    }

    static void withdrawMoney() {
        BankAccount account = authenticateAccount();

        if (account != null) {
            System.out.print("Enter withdrawal amount: Rs.");
            double amount = sc.nextDouble();

            account.withdraw(amount);
        }
    }

    static void checkBalance() {
        BankAccount account = authenticateAccount();

        if (account != null) {
            System.out.println("\nAccount Holder: " + account.getName());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Available Balance: Rs." + account.getBalance());
        }
    }

    static void transferMoney() {
        BankAccount sender = authenticateAccount();

        if (sender == null) {
            return;
        }

        System.out.print("Enter receiver account number: ");
        BankAccount receiver = findAccount(sc.next());

        if (receiver == null || receiver == sender) {
            System.out.println("Invalid receiver account.");
            return;
        }

        System.out.print("Enter transfer amount: Rs.");
        double amount = sc.nextDouble();

        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Invalid transfer amount.");
            return;
        }

        double minimum = sender instanceof SavingsAccount ? 1000 : 500;

        if (sender.getBalance() - amount < minimum) {
            System.out.println("Insufficient balance or minimum balance rule violated.");
            return;
        }

        if (sender instanceof CurrentAccount && amount > 50000) {
            System.out.println("Transfer limit is Rs.50000.");
            return;
        }

        if (!Double.isFinite(receiver.getBalance() + amount)) {
            System.out.println("Transfer cannot be completed.");
            return;
        }

        if (sender.withdraw(amount)) {
            receiver.deposit(amount, "Transfer received from "
                    + sender.getAccountNumber());

            sender.addTransaction("Transfer to "
                    + receiver.getAccountNumber() + ": Rs." + amount);

            System.out.println("Transfer completed successfully.");
        }
    }

    static void transactionHistory() {
        BankAccount account = authenticateAccount();

        if (account != null) {
            account.showTransactions();
        }
    }

    static void accountDetails() {
        System.out.print("Enter account number: ");
        BankAccount account = findAccount(sc.next());

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        account.showDetails();

        System.out.print("Enter PIN to view balance: ");
        String pinText = sc.next();

        if (pinText.matches("[0-9]{4}")
                && account.authenticate(Integer.parseInt(pinText))) {
            System.out.println("Balance: Rs." + account.getBalance());
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    public static void main(String[] args) {

        int choice = 0;

        do {
            System.out.println("\n===== WELCOME TO SMARTBANK =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. View Transaction History");
            System.out.println("7. Display Account Details");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        createAccount();
                        break;

                    case 2:
                        depositMoney();
                        break;

                    case 3:
                        withdrawMoney();
                        break;

                    case 4:
                        checkBalance();
                        break;

                    case 5:
                        transferMoney();
                        break;

                    case 6:
                        transactionHistory();
                        break;

                    case 7:
                        accountDetails();
                        break;

                    case 8:
                        System.out.println("Thank you for using SmartBank!");
                        break;

                    default:
                        System.out.println("Invalid menu choice.");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 8);

        sc.close();
    }
}
