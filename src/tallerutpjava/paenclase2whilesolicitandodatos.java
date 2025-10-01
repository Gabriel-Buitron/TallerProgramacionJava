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
public class paenclase2whilesolicitandodatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";
        while (continuar.equals("si")) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.next();
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
            System.out.println("¿Desea ingresar otro usuario? (si/no): ");
            continuar = scanner.next();
        }
        System.out.println("Programa terminado.");
        scanner.close();
    }
}
