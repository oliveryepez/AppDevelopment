package com.example.oliver.contactlist.models;

import java.io.Serializable;

/**
 * Created by Oliver on 8/30/2015.
 */
public class Contact implements Serializable {
    public String name;
    public String lastName;
    public int phoneNumber;
    public String email;
    public String image;

    public Contact(String name, String lastName, int phoneNumber, String email, String image) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.image = image;
    }
}
