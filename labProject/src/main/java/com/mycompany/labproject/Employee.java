/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labproject;

/**
 *
 * @author lenovo
 */

public class Employee {

    private String name;

    private Date hireDate;

    private double salary;

    public Employee() {
        name = null;
        hireDate = new Date();
        salary = 1200;
    }
    public Employee(String name, Date hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        setSalary(salary);
    }
    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            salary = 1200;
        }
    }
    /**
     * Get the value of hireDate
     *
     * @return the value of hireDate
     */
    public Date getHireDate() {
        return hireDate;
    }
    /**
     * Set the value of hireDate
     *
     * @param hireDate new value of hireDate
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }
    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployeeInfo() {
        return name + "  " + hireDate.getDate() + "  " + salary+"$";
    }

}
