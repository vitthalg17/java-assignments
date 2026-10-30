package com.vitthal.profile;

public class Customer {
    @Export(name = "full_name")
    private String name;

    @Export
    private String city;

    @Export(name = "card_number")
    @Masked(visible = 4)
    private String cardNumber;

    @Export(name = "phone")
    @Masked(visible = 3)
    private String mobile;

    private String password;

    public Customer(String name, String city, String cardNumber, String mobile, String password) {
        this.name = name;
        this.city = city;
        this.cardNumber = cardNumber;
        this.mobile = mobile;
        this.password = password;
    }
}
