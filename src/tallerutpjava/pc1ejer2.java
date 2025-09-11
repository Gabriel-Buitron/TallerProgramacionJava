/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerutpjava;

import java.util.Scanner;

/**
 *
 * @author GABRIEL BUITRÓN RAMOS GABRIEL - U23252523
 */
public class pc1ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Requerimos los nombres del usuario 
        System.out.print("Ingrese sus nombres: ");
        String nombres = scanner.nextLine();
        
        //Requerimos los apellidos del usuario 
        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.nextLine();
        
        //Pedimos la edad 
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        //Pedimos el peso 
        System.out.print("Ingrese su peso (kg): ");
        double peso = scanner.nextDouble();
        
        //Pedimos si es estudiante 
        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();
        
        //Mostramos la información del usuario 
        System.out.println("\n==== INFORMACION DEL USUARIO ====");
        System.out.println("Nombre       : " + nombres);
        System.out.println("Apellidos    : " + apellidos);
        System.out.println("Edad         : " + edad + "años");
        System.out.println("Peso         : " + peso + "kg");
        System.out.println("¿Es estudiante?: " + esEstudiante);
        
        scanner.close();
        
    }
}
