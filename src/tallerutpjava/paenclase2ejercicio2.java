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
public class paenclase2ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";
        int nota;
        int suma = 0;
        int contador = 0;
        int aprobados = 0;
        int desaprobados = 0;
        while (continuar.equals("si")){
            System.out.print("Ingrese una nota: ");
            nota = scanner.nextInt();
            if (nota < 0) {  // si es negativo se rompe el bucle y se acaba 
                break; 
            }
            suma = suma + nota;
            contador = contador + 1;
            
            if (nota >= 11){
                aprobados = aprobados + 1;
            } else {
                desaprobados = desaprobados + 1;
            }
            System.out.print("¿Desea ingresar otra nota (si/no): ?");
            continuar = scanner.next();
        }
        if (contador > 0){
            double promedio = (double) suma / contador;
            System.out.println("\n--- Resultados ---");
            System.out.println("Cantidad de notas ingresadas: " + contador);
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Desaprobados: " + desaprobados);
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);
            
        } else{
            System.out.println("No se ingresaron notas validas.");
            
        }
        
        scanner.close();
       
       
    }
  
} 
  

