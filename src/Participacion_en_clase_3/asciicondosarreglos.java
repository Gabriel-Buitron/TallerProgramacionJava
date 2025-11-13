/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class asciicondosarreglos {
    public static void main(String[] args) {
        String[] productos = {"Laptop", "Mouse", "Teclado"};
        double[] precios ={2500, 50, 120};
        int[][] ventas = {
            {3, 5, 2},
            {10, 8, 12},
            {4, 3, 6}
        };
        System.out.println("======================================================");
        System.out.println("        R E P O R T E  D E  P R O D U C T O S");
        System.out.println("======================================================");
        System.out.println("PRODUCTO\tPRECIO\tT1\tT2\tT3\tTOTAL\tIMPORTE");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < productos.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++){
                total = total + ventas[i][j];
            }
            double importe = total * precios[i];
            System.out.println(productos[i] + "\t" +
                    precios[i] + "\t" + 
                    ventas[i][0] + "\t" +
                    ventas[i][1] + "\t" +
                    ventas[i][2] + "\t" +
                    total + "\t" +
                    importe);
        }
        System.out.println("======================================================");
        System.out.println("Analista: Gabriel Buitron");
        System.out.println("======================================================");
    }
}
