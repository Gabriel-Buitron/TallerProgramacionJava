/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class sem11ejer1 {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Ana", "Luis", "Maria", "Pedro"};
        double[][] notas = {
            {15, 14, 16, 18},
            {19, 17, 18, 20},
            {13, 12, 14, 15},
            {17, 18, 16, 19},
            {14, 15, 13, 16}
        };
        int num = nombres.length;
        double[] promedio = new double[num];
        for (int i = 0; i < num; i++){
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                suma = suma + notas[i][j];
            }
            promedio[i] = suma / 4;
        }
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++){
                char letra1 = nombres[i].charAt(0);
                char letra2 = nombres[j].charAt(0);
                if (letra1 > letra2) {
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;
                    double[] tempNotas = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tempNotas;
                    double tempProm = promedio[i];
                    promedio[i] = promedio[j];
                    promedio[j] = tempProm;
                }
            }
        }
        System.out.println("==============================================");
        System.out.println("       R E P O R T E  D E  N O T A S"); 
        System.out.println("==============================================");
        System.out.println("NOMBRE\tPC1\tPC2\tPC3\tEF\tPROMEDIO");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < num; i++){
            System.out.println(nombres[i] + "\t" +
                    notas [i][0] + "\t" +
                    notas [i][1] + "\t" +
                    notas [i][2] + "\t" +
                    notas [i][3] + "\t" +
                    promedio[i]);
        }
        System.out.println("===============================================");
        System.out.println("Analista: Gabriel Buitron Ramos");
        System.out.println("===============================================");
    }
}
