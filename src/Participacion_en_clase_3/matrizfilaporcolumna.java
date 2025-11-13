/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class matrizfilaporcolumna {
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 4, 7},
            {1, 3, 8},
            {2, 9, 6}
        };
        System.out.println("Matriz Original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - 1; j++) {
                for (int k = j + 1; k < 3; k++) {
                    if (matriz[i][j] > matriz[i][k]) {
                        int temp = matriz[i][j];
                        matriz[i][j] = matriz[i][k];
                        matriz[i][k] = temp; 
                    }
                }
            }
        }
        System.out.println("\nMatriz Ordenada por Fila: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
