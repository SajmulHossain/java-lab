class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account() {
        System.out.println("Account Created.");
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Transaction Methods
    public void depositMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

// 2. Child Class: FixedAccount (Extends Account)
class FixedAccount extends Account {
    private int tenureYear;

    public FixedAccount() {
        // Implicitly calls super()
        System.out.println("Fixed Account initialized.");
    }

    public void setTenureYear(int tenureYear) {
        this.tenureYear = tenureYear;
    }

    public int getTenureYear() {
        return tenureYear;
    }
}

// 3. Child Class: SavingsAccount (Extends Account)
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
        // Implicitly calls super()
        System.out.println("Savings Account initialized.");
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

// 4. Main Class: Start
public class Start {
    public static void main(String[] args) {

        // --- Demonstrating FixedAccount ---
        System.out.println("=== Fixed Account Demonstration ===");
        FixedAccount fa = new FixedAccount();

        // Setting inherited attributes (from Account)
        fa.setAccountNumber("FA-101");
        fa.setAccountHolderName("John Doe");
        fa.setBalance(5000.0);

        // Setting specific attributes (from FixedAccount)
        fa.setTenureYear(5);

        // Demonstrating methods
        System.out.println("Holder: " + fa.getAccountHolderName());
        System.out.println("Tenure Years: " + fa.getTenureYear());
        System.out.println("Initial Balance: " + fa.getBalance());

        fa.depositMoney(1000); // Inherited method
        fa.withdrawMoney(500); // Inherited method
        System.out.println("Current Balance: " + fa.getBalance());
        System.out.println();

        // --- Demonstrating SavingsAccount ---
        System.out.println("=== Savings Account Demonstration ===");
        SavingsAccount sa = new SavingsAccount();

        // Setting inherited attributes (from Account)
        sa.setAccountNumber("SA-202");
        sa.setAccountHolderName("Jane Smith");
        sa.setBalance(2000.0);

        // Setting specific attributes (from SavingsAccount)
        sa.setInterestRate(3.5);

        // Demonstrating methods
        System.out.println("Holder: " + sa.getAccountHolderName());
        System.out.println("Interest Rate: " + sa.getInterestRate() + "%");
        System.out.println("Initial Balance: " + sa.getBalance());

        sa.withdrawMoney(3000); // Trying to withdraw more than balance
        sa.depositMoney(500);
        System.out.println("Final Balance: " + sa.getBalance());
    }
}