package _45_Banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public boolean addBranch(String nameOfBranch) {
        if (findBranch(nameOfBranch) == null) {
            branches.add(new Branch(nameOfBranch));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branch, String customerName, double initialAmount) {
        Branch foundBranch = findBranch(branch);
        if (foundBranch != null) {
            return foundBranch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branch, String customerName, double tranaction) {
        Branch foundBranch = findBranch(branch);
        if (foundBranch != null) {
            return foundBranch.addCustomerTransaction(customerName,tranaction);
        }
        return false;
    }

    private Branch findBranch(String branch) {
        for (int i = 0; i < branches.size(); i++) {
            Branch foundBranch = branches.get(i);
            if (foundBranch.getName().equals(branch)) {
                return foundBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branch, boolean printTransaction) {
        Branch existingBranch = findBranch(branch);
        if (existingBranch != null) {
            System.out.println("Customer details for branch " + existingBranch.getName());
            ArrayList<Customer> customers = existingBranch.getCustomers();

            for (int i = 0; i < customers.size(); i++) {
                Customer branchCustomer = customers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "["+ (i+1) + "]");
                if (printTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < branchCustomer.getTransactions().size(); j++) {
                        System.out.println("["+ (j+1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}

