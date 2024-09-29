/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testproj;

/**
 *
 * @author lenovo
 */
public class Employ extends NewClass{
    private String company;
    
    
    public Employ(String name, int id, String gender, String job) {
        super(name, id, gender, job);
    }
    public String getCom(){
        return this.company;
    }
    public void setCom(String com){
        this.company=com;
    }
    @Override
    public void getInfo(){
        System.out.println("name"+this.getName());
                System.out.println("name"+this.getGender());
        System.out.println("name"+this.getJob());
        System.out.println("name"+this.getId());

        System.out.println("com : "+this.company);
     
    }
    
    
}
