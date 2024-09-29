/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javastart;

/**
 *
 * @author lenovo
 */
public class Car {

    private String name;
    private int modle;
    private bd bdcar;

    public Car(String name, int modle, bd bdcar) {
        this.name = name;
        this.modle = modle;
        this.bdcar = bdcar;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModle() {
        return modle;
    }

    public void setModle(int modle) {
        this.modle = modle;
    }

    public bd getBdcar() {
        return bdcar;
    }

    public void setBdcar(bd bdcar) {
        this.bdcar = bdcar;
    }

    public void getInfo() {
        System.out.println("the name of car : " + name + " \n" + "the model of car :  " + modle +"\n"+ "the date of made is :  " + bdcar.getDay() + "-" + bdcar.getMonth() + "-" + bdcar.getYear());
    }

}
