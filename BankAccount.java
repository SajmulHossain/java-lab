public class BankAccount {
    public static class InnerBankAccount {        
        private String accountNumber;
        private String accountHolder;
        private double balance;

        public InnerBankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        
        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }
        
        public void deposit(double amount) {
            if(amount > 0) {
                balance += amount;
                System.out.println("Depostie of $" + amount + " successfull. New balance: $" + balance);
            } else {
                System.out.println("Invalid deposite amount");
            }
        }

        public void withdraw(double amount) {
            if(amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Withdraw of $" + amount + " successful. New balance is $" + balance);
            } else if(amount <= 0) {
                System.out.println("Invalid withdrawal amount");
            } else {
                System.out.println("Insufficient funds for withdrawal");
            }
        }

        public void displayAccountInfo() {
            System.out.println("---Account information---");
            System.out.println("Account number number: "+ accountNumber);
            System.out.println("Account Holder name: "+ accountHolder);
            System.out.println("Current balance: " + balance);
        }
    }

    public static void main(String[] args) {
        InnerBankAccount myAccount = new InnerBankAccount("123", "Sajmul Hossain", 20000);
        myAccount.displayAccountInfo();
        System.out.println();
        myAccount.deposit(3000);
        System.out.println();
        myAccount.displayAccountInfo();
        System.out.println();
        myAccount.withdraw(2300);
        System.out.println();
        myAccount.displayAccountInfo();
        System.out.println();
        System.out.println(myAccount.accountHolder);
    }
}