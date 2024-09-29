/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffee;

/**
 *
 * @author lenovo
 */
import java.util.Timer;
public class Machine {

    private WaterTank Water ;
    private double AR;
    private double RB;

    public Machine(WaterTank Water, double AR, double RB) {
        this.Water = Water;
        this.AR = AR;
        this.RB = RB;
    }

   
   
    public void addBeansAR(double amount){
        this.AR+=amount;
    };
     public void addBeansRB(double amount){
        this.RB+=amount;
    };
     

  
  
    public double getAR() {
        return AR;
    }

    public double getRB() {
        return RB;
    }

    public String mackeCofee(String Type_coffee, String TypeBeans, String Amount, int grinding_duration) throws InterruptedException {
        if(this.AR==0 || this.RB==0){
            return "Please add coffee beans";
        }else if(this.Water.getCurrentLevel()==0){
            return "Please fill the water tank";
        }
        System.out.println(" pleas wait while it is grinding...");
        Thread.sleep(grinding_duration);
        
        if (Type_coffee == "ass") {
            if (TypeBeans == "arr") {
                if (Amount == "single") {
                    this.AR -= 7;
                    this.Water -= 30;
                } else {
                    this.AR -= 14;
                    this.Water -= 60;
                }

            } else if (TypeBeans == "rbb") 
            {
                if (Amount == "single") 
                {
                    this.RB -= 7;
                    this.Water -= 30;
                } else 
                {
                    this.RB -= 14;
                    this.Water -= 60;
                }
            }

        } else {
            if (TypeBeans == "arr") {
                if (Amount == "single") {
                    this.AR -= 7;
                    this.Water -= 30;
                } else {
                    this.AR -= 14;
                    this.Water -= 60;
                }
            } else if (TypeBeans == "rbb") {
                if (Amount == "single") {
                    this.RB -= 7;
                    this.Water -= 30;
                } else {
                    this.RB -= 14;
                    this.Water -= 60;
                }
            }

        }
        return "type coffee \t"+Type_coffee+"type Bens\t"+TypeBeans;

    }

}
