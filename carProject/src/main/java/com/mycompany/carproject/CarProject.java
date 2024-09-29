/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carproject;

/**
 *
 * @author lenovo
 */


public class CarProject {


    public static void main(String[] args) {
        Person p1=new Person("mahmoud", 1212,  new BirthDate(2002, 8  , 4));
        Person p2=new Person("mohamad", 1310,  new BirthDate(2002, 9  , 9));
        p1.getInfo();
        p2.getInfo();


    
    }
}

