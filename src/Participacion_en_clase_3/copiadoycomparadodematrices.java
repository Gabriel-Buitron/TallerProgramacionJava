/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class copiadoycomparadodematrices {
    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int [][] matrizB = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = matrizA[i][j];
            }
        }
        boolean iguales = true; 
        for (int i = 0; i < 3; i++) {
            for( int j = 0; j < 3; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    iguales = false;
                }
            }
        }
        System.out.println("Matriz A y Matriz B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.print("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.print("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        if (iguales == true) {
            System.out.println("\nLas matrices son iguales");
        } else {
            System.out.println("\nLas matrices son diferentes");
        }
    }
}
