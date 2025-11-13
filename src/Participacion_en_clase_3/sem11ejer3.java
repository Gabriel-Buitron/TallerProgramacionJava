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
public class sem11ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[3][3];
        double[] sumaFila = new double [3];
        double[] promedioFila = new double[3];
        System.out.println("=== Ingreso de datos para la matriz 3x3 ===");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma = suma + matriz[i][j];
            }
            sumaFila[i] = suma;
            promedioFila[i] = suma / 3;
        }
        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Fila " + (i + 1) + " : ");
            System.out.println("  Suma = " + sumaFila[i]);
            System.out.println("  Promedio = " + promedioFila[i]);
        }
        scanner.close();
                
    }
}
