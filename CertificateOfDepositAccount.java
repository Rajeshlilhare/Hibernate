package com.hdfc;

import javax.persistence.*;

@Entity
@Table(name = "cda_account")
public class CertificateOfDepositAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="acc_id")
    private int cda_acc_id;
    @Column(name="account_num")
    private long cda_acc_num;
    @Column(name="holder_name")
    private String cda_holder_name;
    @Column(name="branch")
    private String cda_branch_name;
    @Column(name="city")
    private String cda_city;
    @Column(name="balance")
    private double cda_acc_balance;

    public int getCda_acc_id() {
        return cda_acc_id;
    }

    public void setCda_acc_id(int cda_acc_id) {
        this.cda_acc_id = cda_acc_id;
    }

    public long getCda_acc_num() {
        return cda_acc_num;
    }

    public void setCda_acc_num(long cda_acc_num) {
        this.cda_acc_num = cda_acc_num;
    }

    public String getCda_holder_name() {
        return cda_holder_name;
    }

    public void setCda_holder_name(String cda_holder_name) {
        this.cda_holder_name = cda_holder_name;
    }

    public String getCda_branch_name() {
        return cda_branch_name;
    }

    public void setCda_branch_name(String cda_branch_name) {
        this.cda_branch_name = cda_branch_name;
    }

    public String getCda_city() {
        return cda_city;
    }

    public void setCda_city(String cda_city) {
        this.cda_city = cda_city;
    }

    public double getCda_acc_balance() {
        return cda_acc_balance;
    }

    public void setCda_acc_balance(double cda_acc_balance) {
        this.cda_acc_balance = cda_acc_balance;
    }
}

