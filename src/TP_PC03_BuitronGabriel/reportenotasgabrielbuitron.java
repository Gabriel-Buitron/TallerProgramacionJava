/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_PC03_BuitronGabriel;

/**
 *
 * @author GABRIEL
 */
public class reportenotasgabrielbuitron {
    public static void main(String[] args) {
        String[] nombres = {"Luis", "Ana", "Carlos", "Diana", "Ernesto"};

        int[][] notas = {
            {15, 18, 12, 16},
            {19, 15, 18, 17},
            {10, 12, 14, 11},
            {16, 19, 15, 18},
            {11, 10, 13, 14}
        };

        double[] promedios = new double[nombres.length];

        // 2. Calcular promedios
        for (int i = 0; i < nombres.length; i++) {
            int suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += notas[i][j];
            }
            promedios[i] = suma / 4.0;
        }

        // 3. Ordenar por NOMBRE sin usar compareTo ni auxiliares avanzados
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {

                // Comparación letra por letra
                if (esMayor(nombres[i], nombres[j])) {

                    // Intercambiar nombres
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;

                    // Intercambiar notas
                    int[] tempNotas = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tempNotas;

                    // Intercambiar promedios
                    double tempProm = promedios[i];
                    promedios[i] = promedios[j];
                    promedios[j] = tempProm;
                }
            }
        }

        // 4. Mostrar reporte
        System.out.println("===== REPORTE DE NOTAS - Gabriel Buitron =====");
        System.out.println("Nombre\tPC1\tPC2\tPC3\tEF\tPromedio");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(
                nombres[i] + "\t" +
                notas[i][0] + "\t" +
                notas[i][1] + "\t" +
                notas[i][2] + "\t" +
                notas[i][3] + "\t" +
                String.format("%.2f", promedios[i])
            );
        }

        System.out.println("===============================================");
        System.out.println("Alumno que presenta el reporte: Gabriel Buitron");
    }

    // MÉTODO USADO PARA COMPARAR NOMBRES SIN compareTo()
    public static boolean esMayor(String a, String b) {
        int longitudMin = (a.length() < b.length()) ? a.length() : b.length();

        for (int i = 0; i < longitudMin; i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return true;
            } else if (a.charAt(i) < b.charAt(i)) {
                return false;
            }
        }
        return a.length() > b.length();
    }
}
