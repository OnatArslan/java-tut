package oop;

public class Account {
    private int accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(int accNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account() {

    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
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

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void deposit(double value) {
        this.balance += value;
        System.out.println("Deposit complated");
        System.out.println("Your new balance is "+ this.balance);
    }

    public void withdraw(double value){
        if(value > this.balance){
            System.out.println("Your balance does not support this value");
        }else{
            this.balance -= value;
            System.out.println("Your new balance is "+ this.balance);
        }
    }
}
