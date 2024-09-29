/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrix;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        
        // Read in 12 integers
        System.out.println("Enter 12 integers:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate the sums of the columns
        for (int j = 0; j < 4; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += matrix[i][j];
            }
            matrix[3][j] = sum;
        }
        
        // Print out the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

