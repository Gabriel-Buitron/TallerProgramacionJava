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
public class paenclase2acumcontador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero != 0){
                suma = suma + numero;
                contador = contador + 1;
            }
        } while (numero != 0);
        System.out.println("Se ingresaron " + contador + " numeros.");
        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}
