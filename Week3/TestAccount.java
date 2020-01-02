package assignments;

/**
 *
 * @author Trevor Barker
 * @description: tests the separate Account class
 */
public class TestAccount {

    /**
     * Main method
     */
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000, 4.5);
        System.out.println("Account id #" + account1.getId() + " has $" + 
                account1.getBalance() + " upon " + "creation with a " + 
                account1.getAnnualInterestRate() + " interest rate.");
        
        account1.withdraw(2500);
        System.out.println("After withdrawing $2,500, the new balance is: " +
                account1.getBalance());
        
        account1.deposit(3000);
        System.out.println("After depositing $3,000, the new balance is : " +
                account1.getBalance());
        System.out.println("Balance: " + account1.getBalance() + "\nMonthly Interest: " + 
                account1.getMonthlyInterest() + "\nDate created: " + 
                account1.getDateCreated());
    }
}
