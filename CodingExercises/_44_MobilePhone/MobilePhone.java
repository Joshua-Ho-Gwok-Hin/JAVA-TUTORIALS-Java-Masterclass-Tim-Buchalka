package _44_MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact addContact) {
        if (0 <= findContact(addContact.getName())) {
            return false;
        } else {
            myContacts.add(addContact);
//            System.out.println(myContacts.get(myContacts.size()-1).getName() + " added successfully.");
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) < 0) {
            return false;
        } else {
            myContacts.set(findContact(oldContact), newContact);
            return true;
        }
    }

    public boolean removeContact(Contact deleteContact) {
        if (findContact(deleteContact) < 0) {
            return false;
        } else {
            myContacts.remove(findContact(deleteContact));
            return true;
        }
    }

    private int findContact(Contact element) {
        return myContacts.indexOf(element);
    }

    private int findContact(String findName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact oneOfMyContacts = myContacts.get(i);
            if (oneOfMyContacts.getName().equals(findName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String queryByName) {
        for (Contact eachOfmyContacts : myContacts) {
            if (eachOfmyContacts.getName().equals(queryByName)) {
                return eachOfmyContacts;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i=0; i<myContacts.size(); i++) {
            System.out.println((i+1) + ". " +
                    myContacts.get(i).getName() + " -> " +
                    myContacts.get(i).getPhoneNumber());
        }
    }
}
