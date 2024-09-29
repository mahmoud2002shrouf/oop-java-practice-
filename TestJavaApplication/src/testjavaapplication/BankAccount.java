/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavaapplication;

/**
 *
 * @author lenovo
 */
public class BankAccount {
    private int acc;
    private String cleantName;
    private double balance;
    static int count=0;

    public BankAccount(int acc, String cleantName, double balance) {
        this.acc = acc;
        this.cleantName = cleantName;
        this.balance = balance;
        count++;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public String getCleantName() {
        return cleantName;
    }

    public void setCleantName(String cleantName) {
        this.cleantName = cleantName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void ToString(String name){
        System.out.println(name);
    }
    
    public void ToString(String name,int id){
        System.out.println(name+id);
    }
    
    
}
