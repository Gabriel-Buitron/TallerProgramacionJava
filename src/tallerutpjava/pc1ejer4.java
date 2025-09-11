/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerutpjava;

import java.util.Scanner;

/**
 *
 * @author GABRIEL
 */
public class pc1ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        //Solicitar al usuario un número del 1 al 4 
        System.out.print("Ingrese un numero del 1 al 4 segun el estado del tiempo: ");
        int opcion = scanner.nextInt();
        
        //Lo hacemos con switch
        switch (opcion) {
            case 1:
                System.out.println("¡Dia perfecto para salir!"); //Mensaje si esta soleado
                break;
            case 2:
                System.out.println("Lleva un abrigo por si acaso:"); // Mensaje su esta nublado
                break;
            case 3:
                System.out.println("¡No olvides tu paraguas!"); // Mensaje si esta lluvioso 
                break;
            case 4:
                System.out.println("Es mejor quedarse en casa"); // Mensaje si hay tormenta 
                break;
            default:
                System.out.println("Numero no valido, ingrese un valor entre 1 y 4"); // Mensaje de error 
                        
        }
        
        scanner.close();
        }
    }
