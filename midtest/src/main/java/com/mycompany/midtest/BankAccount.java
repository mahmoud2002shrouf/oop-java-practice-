/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtest;

/**
 *
 * @author lenovo
 */
public class BankAccount {

    int accountNo;
    private String cliantName;
    double balance;
    double address;
    Bd bd;
   
   
    public BankAccount(int accountNo, String cliantName, double balance, double address,Bd bd) {
        this.accountNo = accountNo;
        this.address = address;
        this.balance = balance;
        this.cliantName = cliantName;
        this.bd=bd;
    }

    public BankAccount(int ac) {
        this.accountNo = ac;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getCliantName() {
        return cliantName;
    }

    public void setCliantName(String cliantName) {
        this.cliantName = cliantName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAddress() {
        return address;
    }

    public void setAddress(double address) {
        this.address = address;
    }

    public Bd getBd() {
        return bd;
    }

    public void setBd(Bd bd) {
        this.bd = bd;
    }
    

}
