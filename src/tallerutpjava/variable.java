/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerutpjava;

import java.util.Scanner;


/**
 *
 * @author GABRIEL BUITRON U23252523
 */
public class variable {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine(); 
        System.out.println("Tu nombre es: " + nombre);
        System.out.print("Ingrese su edad: ");
        String edad = scanner.nextLine();
        System.out.println("Tu edad es: " + edad);
        scanner.close(); 
        
    }
}
