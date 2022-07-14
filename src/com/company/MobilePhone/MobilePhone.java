package com.company.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts.add(new Contact("me", myNumber));
    }


    public boolean addNewContact (Contact contact) {
            if (myContacts.contains(contact)) {
                System.out.println("This contact already exist");
                return false;
            } else {
                myContacts.add(contact);
                return true;
            }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
            if (myContacts.contains(oldContact)) {
                int index = myContacts.indexOf(oldContact);
                myContacts.remove(myContacts.indexOf(oldContact));
                myContacts.add(index, newContact);
                return true;
            }else {
                return false;
            }
    }

    public boolean removeContact(Contact contact){
        if (myContacts.contains(contact)){
            myContacts.remove(myContacts.indexOf(contact));
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        if (myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    private int findContact(String contact) {
        if (myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    public Contact queryContact(String contactName){
        if(myContacts.contains(contactName)){
            int index = myContacts.indexOf(contactName);
            return myContacts.get(index);
        } else {
            return null;
        }
    }

    public void printContacts() {
        int x = 0;

        while (x < myContacts.size()) {
            System.out.println(myContacts.get(x).getName() + " -> " + myContacts.get(x).getPhoneNumber());
            x++;
        }
    }





}
