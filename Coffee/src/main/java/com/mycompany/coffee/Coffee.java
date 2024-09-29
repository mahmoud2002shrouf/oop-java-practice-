/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coffee;

/**
 *
 * @author lenovo
 */
public class Coffee {

    public static void main(String[] args) throws InterruptedException {
        Machine cop1=new Machine();
        cop1.addBeansAR(200);
        cop1.addBeansRB(50);
        System.out.println(cop1.mackeCofee("ass", "arr", "single", 10000));
    }
}
