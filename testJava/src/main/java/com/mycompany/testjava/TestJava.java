/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testjava;

/**
 *
 * @author lenovo
 */
import java.util.Scanner
public class TestJava{
    public static int sum(int x,int y) {
    return x+y;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter y = ");
        int y=input.nextInt();
        System.out.println("y="+y);
       Person x=new Person();
       x.name="ahmad";
       x.id=10012;
       x.print();
        
    }
    
}
