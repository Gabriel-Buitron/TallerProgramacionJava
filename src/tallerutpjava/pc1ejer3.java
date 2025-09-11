/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerutpjava;

import java.util.Scanner;

/**
 *
 * @author GABRIEL ELIUD BUITRON RAMOS - U23252523
 */
public class pc1ejer3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       //Solicitamos los datos del usuario 
       System.out.print("Ingrese su nombre: ");
       String nombre = scanner.nextLine();
       
       System.out.print("Ingrese su edad: "); 
       int edad = scanner.nextInt();
       
       //Verificamos con if-else
       if (edad >= 18){
           System.out.println(nombre + ", ¡Bienvenido/a! Puede ingresar.");
       } else {
           System.out.println(nombre + ", lo sentimos, no puede ingresar.");
       }
       
       scanner.close();
       }
    }

