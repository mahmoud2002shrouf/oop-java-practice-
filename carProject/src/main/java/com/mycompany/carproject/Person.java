/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carproject;

/**
 *
 * @author lenovo
 */
public class Person {
    private String name; 
    private int id ; 
    private BirthDate bd ; 
    
   
    
    public Person (String name, int id ,BirthDate bd ){
        this.name=name; 
        this.id=id;
        this.bd=bd; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BirthDate getBd() {
        return bd;
    }

    public void setBd(BirthDate bd) {
        this.bd = bd;
    }
    
    public void getInfo(){
        System.out.println("Name : " + name );
        System.out.println("Id : " + name );
                System.out.println("barth day : " + bd.print());

        System.out.println("age : " + bd.getAge() );
        System.out.println("**********************************");



    }
    
}
