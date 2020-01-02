/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author Trevor
 */
public class Checking extends Account{
    public Checking() {
        super();
    }

    public Checking(int id, double balance, double rate) {
        super(id, balance, rate);
    }

    public void withdraw(double amount) {
        if ((getBalance() - amount) < (getBalance() - 100)) {
            System.out.println("Not enough funds available in your account");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "Checking account id: " + getId() + "\nSavings Account Balance: " + getBalance();
    }
}
