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
public class ejercicios2 {
    public static void main(String[] args) {
        // Pregunta 1 
        
        Scanner input = new Scanner(System.in);
        final double PI = 3.1416;
        double radio;
        double area;
        System.out.print("Ingrese el radio del circulo: ");
        radio = input.nextDouble();
        area = PI * radio * radio;
        System.out.println("El area del circulo es: " + area); 
       
        
        
        //Pregunta 2 
        double celsius;
        double fahrenheit;
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (celsius * 9/5)+32;
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        
        //Pregunta 3 
        double numero1;
        double numero2;
        double numero3;
        double promedio;
        
        System.out.print("Ingrese el primer numero: ");
        numero1 = input.nextDouble();
        
        System.out.print("Ingrese el seguno numero: ");
        numero2 = input.nextDouble();
        
        System.out.print("Ingrese el tercer numero: ");
        numero3 = input.nextDouble();
        
        promedio = (numero1 + numero2 + numero3)/3;
        
        System.out.println("El promedio de los tres numeros es: " + promedio);
        
                
    }
    
}
