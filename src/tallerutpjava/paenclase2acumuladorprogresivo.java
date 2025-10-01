/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerutpjava;

import java.util.Scanner;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class paenclase2acumuladorprogresivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.print("Ingrese N (entero >= 1): ");
        N = scanner.nextInt();
        if (N < 1) {
            System.out.println("N invalido debe ser >= 1");
        } else {
            int i = 1;
            int suma = 0;
            do {
                suma = suma + i;
                i = i + 1;
            } while (i <= N);
            System.out.println("La suma de 1 a " + N + " es: " + suma);
        }
        scanner.close();
    }
}
