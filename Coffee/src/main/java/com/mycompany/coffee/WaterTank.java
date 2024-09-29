/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffee;

/**
 *
 * @author lenovo
 */
public class WaterTank  {
    private double capacity=1000;
    private double currentLevel;

    public WaterTank(double currentLevel) {
        this.currentLevel = currentLevel;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }
    public void getInfo(){
        System.out.println("the capacity = "+this.capacity+"\n"+"the current Level = "+this.currentLevel);
    }
    
}
