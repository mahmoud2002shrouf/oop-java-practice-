/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testproj;

/**
 *
 * @author lenovo
 */
public class NewClass {

    private String name;
        private int id;
    private String gender;
    private String job;
    public NewClass(String name,int id,String gender,String job){
       
        this.name=name;
        this.id=id;
        this.gender=gender;
        this.job=job;

        
        
        
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void getInfo(){
        System.out.println("name : "+this.name);
        System.out.println("id : "+this.id);
        System.out.println("gender : "+this.gender);
        System.out.println("job : "+this.job);


    }

    
    
    
}






