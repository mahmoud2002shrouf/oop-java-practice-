/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labproject;

/**
 *
 * @author lenovo
 */
public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 1970;
    }
    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        this.year = year;
    }
    /**
     * Get the value of year
     *
     * @return the value of year
     */
    public int getYear() {
        return year;
    }
    /**
     * Set the value of year
     *
     * @param year new value of year
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * Get the value of month
     *
     * @return the value of month
     */
    public int getMonth() {
        return month;
    }
    /**
     * Set the value of month
     *
     * @param month new value of month
     */
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }
    /**
     * Get the value of day
     *
     * @return the value of day
     */
    public int getDay() {
        return day;
    }
    /**
     * Set the value of day
     *
     * @param day new value of day
     */
    public void setDay(int day) {
        if (day >= 1 && day <= 30) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }
    public String getDate() {
        return day + "/" + month + "/" + year;
    }
}
