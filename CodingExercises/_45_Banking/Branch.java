package _45_Banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.customers = new ArrayList<Customer>();
        this.name = branchName;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String newCustomerName, double deposit) {
        if (findCustomer(newCustomerName)==null) {
            return customers.add(new Customer(newCustomerName, deposit));
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
