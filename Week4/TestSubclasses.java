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
public class TestSubclasses {
    public static void main(String[] args){
        /** Create the savings account object*/
        Savings account1 = new Savings(1, 5000, 4.5);
        /** withdraw */
        account1.withdraw(2000);
        System.out.println(account1 + "\n");
        
        Savings account2 = new Savings(2, 400, 4.5);
        /** not enough funds */
        account2.withdraw(500);
        System.out.println(account2 + "\n");
        
        /** Create the checking account object */
        Checking checking1 = new Checking(1, 300, 4.5);
        /** withdraw in the overdraft */
        checking1.withdraw(400);
        System.out.println(checking1 + "\n");
        
        Checking checking2 = new Checking(2, 500, 4.5);
        /** withdraw attempt beyond overdraft */
        checking2.withdraw(700);
        System.out.println(checking2);
    }
}
