/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author Trevor Barker
 * @description: savings class to specify overdraft
 * @due date: 06/09/2018
 */
public class Savings extends Account {

    public Savings() {
        super();
    }

    public Savings(int id, double balance, double rate) {
        super(id, balance, rate);
    }

    public void withdraw(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Not enough funds available in your account");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "Savings account id: " + getId() + "\nSavings Account Balance: " + getBalance();
    }
}
