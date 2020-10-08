package com.collections;

public class PreferredCustomer extends Customer {
    private final double discount = 0.05;
    public PreferredCustomer(String name, int custNumber, float balance) {
        super(name, custNumber, balance);
    }
}
