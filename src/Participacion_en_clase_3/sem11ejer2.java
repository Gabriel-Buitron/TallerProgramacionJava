/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

import java.util.Scanner;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class sem11ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        System.out.println("Ingrese los elementos de la matriz 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - 1; j++) {
                for (int k = j + 1; k < 3; k++) {
                    if (matriz[i][j] > matriz [i][k]) {
                        int temp = matriz[i][j];
                        matriz[i][j] = matriz[i][k];
                        matriz[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("\nMatriz Ordenada por Fila: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3 - 1; i++) {
                for (int k = i + 1; k < 3; k++) {
                    if (matriz[i][j] > matriz [k][j]) {
                        int temp = matriz[i][j];
                        matriz[i][j] = matriz[k][j];
                        matriz[k][j] = temp;
                    }
                }
            }
        }
        System.out.println("\nMatriz Ordenada por Columna: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
