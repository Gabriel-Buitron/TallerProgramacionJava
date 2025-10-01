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
public class paenclase2ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un decimal: ");
            numero = scanner.nextInt();
            if (numero < 0) { 
                System.out.println("Numero invalido debe ser mayor o igua a 0");
            }
        } while (numero < 0);
        if (numero == 0) {
            System.out.println("Binario: 0");
            scanner.close();
            return;
        }
        int n = numero;
        String binario = "";
        System.out.println("\nPasos de la conversion (resto | cociente): ");
        while (n > 0) {
            int resto = n % 2;
            int cociente = n / 2;
            System.out.println("resto: " + resto + " | cociente: " + cociente);
            binario = resto + binario;
            n = cociente;
        }
        System.out.println("\nNumero decimal: " + numero);
        System.out.println("Binario: " + binario);
        scanner.close();
    }
}
