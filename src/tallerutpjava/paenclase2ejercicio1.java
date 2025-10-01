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
public class paenclase2ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entre 1-100");
        int numero = scanner.nextInt();
        
        //Si el usuario escribe un numero entre 1 y 100 seguira pidiendo  
        while (numero >= 1 && numero <= 100) {
            
            System.out.println("El numero " + numero + " esta en el rango 1-100.");
            
            System.out.print("Ingrese otro numero: ");
            numero = scanner.nextInt();
            
        }
        
        System.out.println("Numero fuera del rango. Fin del programa finalizado");
        scanner.close();
    }
}
