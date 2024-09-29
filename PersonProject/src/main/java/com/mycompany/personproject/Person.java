/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personproject;

/**
 *
 * @author lenovo
 */
public class Person { 
    private String name ; 
    private String gender ; 
    private String country ; 
    
    Person(String name , String geneder , String country ){  
        setName(name); 
        setGender(geneder);
        setCountry(country);
        
    } 
    
   public void setName(String name){
       this.name = name ;
   }
   public void setGender(String gender){
       this.gender = gender ; 
   }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", country=" + country +"\n" + '}';
    }
  
    
}
