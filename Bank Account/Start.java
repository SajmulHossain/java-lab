class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account() {
        System.out.println("Account Created.");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

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

class FixedAccount extends Account {
    private int tenureYear;

    public FixedAccount() {
        System.out.println("Fixed Account initialized.");
    }

    public void setTenureYear(int tenureYear) {
        this.tenureYear = tenureYear;
    }

    public int getTenureYear() {
        return tenureYear;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
        System.out.println("Savings Account initialized.");
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

public class Start {
    public static void main(String[] args) {
        System.out.println("=== Fixed Account Demonstration ===");
        FixedAccount fa = new FixedAccount();

        fa.setAccountNumber("FA-101");
        fa.setAccountHolderName("John Doe");
        fa.setBalance(5000.0);
        fa.setTenureYear(5);

        System.out.println("Holder: " + fa.getAccountHolderName());
        System.out.println("Tenure Years: " + fa.getTenureYear());
        System.out.println("Initial Balance: " + fa.getBalance());

        fa.depositMoney(1000);
        fa.withdrawMoney(500);
        System.out.println("Current Balance: " + fa.getBalance());
        System.out.println();

        System.out.println("=== Savings Account Demonstration ===");
        SavingsAccount sa = new SavingsAccount();

        sa.setAccountNumber("SA-202");
        sa.setAccountHolderName("Jane Smith");
        sa.setBalance(2000.0);
        sa.setInterestRate(3.5);

        System.out.println("Holder: " + sa.getAccountHolderName());
        System.out.println("Interest Rate: " + sa.getInterestRate() + "%");
        System.out.println("Initial Balance: " + sa.getBalance());

        sa.withdrawMoney(3000);
        sa.depositMoney(500);
        System.out.println("Final Balance: " + sa.getBalance());
    }
}