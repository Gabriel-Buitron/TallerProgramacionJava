/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class arreglosparalelos {
    public static void main(String[] args) {
        String[] alumnos = {"Ana", "Carlos", "Luis"};
        double[][] notas = {
            {15, 18, 17},
            {14, 13, 16},
            {12, 15, 14}
        };
        double[] promedios = new double[3];
        for (int i = 0; i < alumnos.length; i++) {
            double suma = 0;
            for (int j = 0; j < 3;  j++){
                suma = suma + notas[i][j];
            }
            promedios[i] = suma / 3;
        }
        System.out.println("==== Promedios por Alumno ====");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i] + ": " + promedios[i]);
        }
    }
}
