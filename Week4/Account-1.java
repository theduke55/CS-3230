package assignments;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Trevor Barker
 * @description A program to simulate withdrawing, depositing, and inquiring an account
 */
public class Account {
    /** Private variables */
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    
    /** No argument constructor that creates a default account */
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    /** Constructor that creates an account with a specified id and balance */
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate / 100;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    
    public void withdraw(double amount){
        balance -= amount;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
}
