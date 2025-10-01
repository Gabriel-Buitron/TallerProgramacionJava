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
public class paenclase2whileprocesamientocalculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.print("Ingrese un numero: ");
        numero = scanner.nextInt();
        while (numero >= 0) {
            suma = suma + numero;
            System.out.print("Ingrese otro numero (uno negativo para terminar): ");
            numero = scanner.nextInt();
        }
        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}
