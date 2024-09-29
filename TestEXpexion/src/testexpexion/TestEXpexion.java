/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexpexion;

/**
 *
 * @author lenovo
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEXpexion {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);
try{
        System.out.println("enter first num \n ");
        int x = input.nextInt();
        System.out.println("enter secand num \n ");
        int y = input.nextInt();
        double res = x / y;
        System.out.println("res" + res);

    }catch(InputMismatchException | ArithmeticException ex){
        System.out.println("ex : "+ex.getMessage());
    }
    }

}
