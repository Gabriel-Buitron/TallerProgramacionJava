/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerutpjava;

import java.util.Scanner;


/**
 *
 * @author GABRIEL BUITRON RAMOS U23252523
 */
public class ejemplomath {
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     System.out.print("\n Ingrese un numero para calcular: ");
     double numero = scanner.nextDouble();
     double raizcuadrada = Math.sqrt(numero);
     System.out.println("La Raiz cuadrada de " + numero + " es: " + raizcuadrada);
     scanner.close();
     
     double nume =49.0;
     double raizcua = Math.sqrt(nume);
     System.out.println("La Raiz cuadrada de " + nume + " es: " + raizcua); 
             
     scanner.close();
     
    }
}
