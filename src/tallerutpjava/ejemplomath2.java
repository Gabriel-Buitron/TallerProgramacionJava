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
public class ejemplomath2 {
    public static void main(String[] args) {
        // Hallar el valor absoluto 
        
        Scanner scanner = new Scanner (System.in); 
        System.out.print("\n Ingrese un numero para calcular su valor absoluto: "); //Ingresamos un numero 
        double numero = scanner.nextDouble(); 
        double valorabsoluto = Math.abs(numero); //Se calcula el valor absoluto 
        System.out.println("El valor absoluto de: " + numero + " es: " + valorabsoluto); //Da el resultado en valor positivo 
        
        
        //Hallar la potencia de un numero 
        System.out.print("Ingrese un numero para potenciar: "); //ingresamos un numero 
        double nume1 = scanner.nextDouble();
        System.out.print("Ingrese la potencia: "); //Ingresamos la potencia 
        double potencia = scanner.nextDouble();
        double resultado = Math.pow(nume1, potencia); //Se eleva el numero a la potencia dada 
        System.out.println("La potencia de: " + nume1 + " a la " + potencia + " es: " + resultado); //te da el resultado potenciado 
        
        
        //Encontrar el mayor numero entre dos numeros  
        System.out.print("Ingrese el primer numero: "); //Ingresamos un primer numero aleatorio 
        double Num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: "); //Ingresamos un segundo numero aleatorio 
        double Num2 = scanner.nextDouble();
        double mayor = Math.max(Num1, Num2); //Se calcula cual sera el mayot numero ingresado 
        System.out.println("El mayor numero entre " + Num1 + " y " + Num2 + " es: " + mayor); // Da el mayor resultado entre los dos numeros 
        
        scanner.close();
        
        
    }
}
