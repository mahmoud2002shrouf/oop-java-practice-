/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javastart;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class Javastart{
    public static int add(int x,int y){
        return x+y;
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        Car car1=new Car("bmw", 2020, new bd(2,2,2019));
        car1.getInfo();
        B p1=new B();
        p1.setX(10);
        System.out.println( p1.getX());
      
    }
}