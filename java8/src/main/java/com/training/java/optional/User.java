package com.training.java.optional;

public class User {
    class Address {
        private String street;

        public Address(String street) {
            this.street = street;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
