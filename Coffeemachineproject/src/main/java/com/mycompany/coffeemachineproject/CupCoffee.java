/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeemachineproject;

/**
 *
 * @author lenovo
 */
public class CupCoffee {
    private String TypeBeans;
        private String TypeCoffee;
        private String sizeCoup;
        private int GraderRate;

    public CupCoffee(String TypeBeans, String TypeCoffee, String sizeCoup, int GraderRate) {
        this.TypeBeans = TypeBeans;
        this.TypeCoffee = TypeCoffee;
        this.sizeCoup = sizeCoup;
        this.GraderRate = GraderRate;
    }

    public String getTypeBeans() {
        return TypeBeans;
    }

    public void setTypeBeans(String TypeBeans) {
        this.TypeBeans = TypeBeans;
    }

    public String getTypeCoffee() {
        return TypeCoffee;
    }

    public void setTypeCoffee(String TypeCoffee) {
        this.TypeCoffee = TypeCoffee;
    }

    public String getSizeCoup() {
        return sizeCoup;
    }

    public void setSizeCoup(String sizeCoup) {
        this.sizeCoup = sizeCoup;
    }

    public int getGraderRate() {
        return GraderRate;
    }

    public void setGraderRate(int GraderRate) {
        this.GraderRate = GraderRate;
    }

    @Override
    public String toString() {
        return TypeBeans + ", " + TypeCoffee + ", " + sizeCoup + ", "+ GraderRate ;
    }
    

    
    
}
