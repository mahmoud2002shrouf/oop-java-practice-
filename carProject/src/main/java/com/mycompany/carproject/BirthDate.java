/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carproject;

/**
 *
 * @author lenovo
 */
import java.time.LocalDate;


public class BirthDate {
    
    private int year; 
    private int month; 
    private int dayOfMonth ; 
    
    public BirthDate(int year,int month, int dayOfMonth){
        this.dayOfMonth=dayOfMonth; 
        this.month=month;
        this.year=year;
    }
    public int getDay(){
        return dayOfMonth; 
    }
    public void setDay(int day){
        if(day>0&&day<=31)
        this.dayOfMonth=day; 
        else 
            System.out.println("The day out of range");
    }
    public int getMonth(){
        return month; 
    }
    public void setMonth(int month){
        if (month>0&&month<=12)
        this.month=month; 
        else 
            System.out.println("The Month is out of Range ");
    }
    public int  getYear(){
        return year; 
    }
    public void setYear(int year){
        if (year<2024)
        this.year=year;
        else 
            System.out.println("The Years is out of Range");
    }
    public String getAge(){
        LocalDate today = LocalDate.now();
        System.out.println("soso"+today);

        int currentYear=today.getYear();
         int currentMonth=today.getMonthValue();
          int currenytDay=today.getDayOfMonth();
          
        int years = currentYear-year;//2023-2002=21-1=20
        int months = currentMonth-month;//2-8=-6+12=6
        int days = currenytDay-dayOfMonth; //20-4=16
     
           if(months<0){
            years -= 1;
            months=(12+currentMonth)-month;
        }
        if(days<0){
            month -= 1;
            days=(30+currenytDay)-dayOfMonth;
        }
        return years+" years "+months+" months "+days+" days ";
    }
    public String print(){
      String months[] =
    {
          "January" , "February" , "March" , "April", "May",
        "June", "July", "August", "September", "October",
        "November", "December"
    };
        return months[month-1]+ " "+dayOfMonth +","+year;//months[3]
    }
    
}