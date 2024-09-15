package com.hdfc;

public class SavingAcoount {
    private long acc_number;
    private String acc_holder_name;
    private String branch_name;
    private String city;
    private double acc_balance;

    public long getAcc_number() {
        return acc_number;
    }

    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }

    public String getAcc_holder_name() {
        return acc_holder_name;
    }

    public void setAcc_holder_name(String acc_holder_name) {
        this.acc_holder_name = acc_holder_name;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }
}
