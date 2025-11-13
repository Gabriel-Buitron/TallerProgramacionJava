/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class reporteascii {
    public static void main(String[] args) {
        int[][] ventas = {
            {100, 200, 150},
            {80, 120, 90},
            {300, 250, 200}
        };
        System.out.println("===========================================");
        System.out.println("     R E P O R T E  D E  V E N T A S");
        System.out.println("===========================================");
        System.out.println("SUCURSAL\tLUNES\tMARTES\tMIERCOLES\tTOTAL");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 3; i++) {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                suma = suma + ventas[i][j];
            }
            System.out.println("Sucursal " + (i + 1) + "\t" +
                    ventas[i][0] + "\t" +
                    ventas[i][1] + "\t" +
                    ventas[i][2] + "\t\t" + suma);
        }
        System.out.println("============================================");
        System.out.println("Analista: Gabriel Buitron");
        System.out.println("============================================");
    }
}
