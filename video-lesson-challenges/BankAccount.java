public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("Your new balance is " + this.balance);
    }

    public void withdrawFunds(double amount){
        if (amount<=this.balance){
            this.balance -= amount;
            System.out.println("Your new balance is " + this.balance);
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount johnAccount = new BankAccount();
        johnAccount.setBalance(200);
        johnAccount.depositFunds(50);
        johnAccount.withdrawFunds(150);
    }
}
