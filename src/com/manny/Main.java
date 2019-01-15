package com.manny;

public class Main {

    public static void main(String[] args) {
	// Challenge!
        /* Create a simple banking app. There should be a Bank class. It should have an ArrayList of branches.
        Each branch should have an ArrayList of Customers. The Customers should have an ArrayList of Doubles (transactions)
        Customer:
        Name, and ArrayList of doubles.
        Branch:
        Need to be able to add a new customer and initial transaction amount. Also needs to add additional transactions
        for that customer/branch.
        Bank:
        Add a new branch
        Add a customer to that branch with initial transaction
        Add a transaction for an existing customer for that branch
        Show a list of customers for a particular branch and optionally a list of their transactions.
        Demonstrate Autoboxing and Unboxing in your code.
        hint: Transactions
        Add data validation.
        e.g. check if it exists, or does not exist, etc.
        Think about where you are adding the code to perform certain actions.
        */

        Bank bank = new Bank("US Bank");

        if(bank.addBranch("Avondale")){
            System.out.println("Avondale branch created");
        }


        bank.addCustomer("Avondale", "Manny", 100000.54);
        bank.addCustomer("Avondale", "Estella", 100000.55);
        bank.addCustomer("Avondale", "Andrew", 100000.56);

        bank.addBranch("Glendale");
        bank.addCustomer("Glendale", "Maria", 100000.57);

        bank.addCustomerTransaction("Avondale", "Manny", 50000.00);
        bank.addCustomerTransaction("Avondale", "Estella", 25000.00);
        bank.addCustomerTransaction("Avondale", "Andrew", 75000.00);

        bank.listCustomers("Avondale", true);
        bank.listCustomers("Glendale", true);

        bank.addBranch("Phoenix");

        if(!bank.addCustomer("Phoenix", "Amber", 5.53)){
            System.out.println("Error: Phoenix branch does not exist");
        }

        if(!bank.addBranch("Avondale")){
            System.out.println("Avondale branch already exists");
        }

        if(!bank.addCustomerTransaction("Avondale", "Abel", 45.23)){
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Avondale", "Manny", 12.21)) {
            System.out.println("Customer Manny already exists");
        }
    }
}

