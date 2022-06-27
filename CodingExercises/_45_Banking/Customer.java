package _45_Banking;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.transactions = new ArrayList<Double>();
        this.name = name;
        addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
