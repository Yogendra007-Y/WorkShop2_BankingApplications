package com.bridgelabz;

public class BankingApplication {

    public static void main(String[] args) {
        // Instantiate 2 saving account objects saver1 and saver2
        SavingsAccount saver1, saver2;

        saver1 = new SavingsAccount (2000.0);
        saver2= new SavingsAccount (3000.0);

        // Set the annual interest rate to 4 % = 4/100 = 0.04
        SavingsAccount.modifyInterestRate (0.04);

        // Calculate monthly interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Print new balances for both savers
        System.out.println("This month Saver 1 balance is: "+ saver1.getSavingBalance());
        System.out.println("This month Saver 2 balance is: "+ saver2.getSavingBalance());
    }
}
