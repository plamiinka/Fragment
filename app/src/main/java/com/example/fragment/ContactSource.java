package com.example.fragment;

import java.util.ArrayList;

public class ContactSource {

    ArrayList<Data> contactList;

    public ContactSource(){

        contactList = new ArrayList<Data>();
    }

    public  ArrayList<Data> getContactList() {
        return contactList;
    }
}
