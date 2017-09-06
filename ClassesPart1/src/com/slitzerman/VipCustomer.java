package com.slitzerman;

/**
 * Created by Niko Pinnis on 2.1.2017.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("John Doe", 0d, "John.Doe.@somemail.com");
    }

    public VipCustomer(String name, String email) {
        this(name, 0d, email);

    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
