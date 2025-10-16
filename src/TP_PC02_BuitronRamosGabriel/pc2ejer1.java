/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_PC02_BuitronRamosGabriel;

import java.util.Scanner;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class pc2ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;   // el usuario ingresa el precio 
        double suma = 0; // acumulador de precios validos 
        int contador = 0;  // cantidad total de productos 
        int altoValor = 0;  // contador de productos >= 50 
        int bajoValor = 0;  // contador de productos <50
        System.out.println("=== CONTROL DE INVENTARIO EN BODEGA ===");
        System.out.println("Ingrese precios unitarios entre $10.00 y $100.000");
        System.out.println("Para terminar, ingrese cero(0)");
        System.out.println("---------------------------------------");
        //realizamos el bucle 
        do {
            System.out.print("Ingrese los precios del producto: ");
            precio = scanner.nextDouble();
            if (precio == 0) {
                System.out.println("Fin del registro de productos");
                break;
            }
            if (precio >= 10 && precio <= 100) {
                suma = suma + precio;
                contador = contador + 1;
                if (precio >= 50){
                    altoValor = altoValor + 1;
                } else {
                    bajoValor = bajoValor + 1;
                }
            } else {
                System.out.println("Precio invalido debe estar entre $10.00 y $100.000");
            }
        } while (true);
        System.out.println("\n=== REPORTE FINAL ===");
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("1. Promedio general de precios: " + promedio);
            System.out.println("2. Productos de ALTO VALOR: " + altoValor);
            System.out.println("3. Productos de BAJO VALOR: " + bajoValor);
        } else {
            System.out.println("No se registraron productos validos");
        }
        System.out.println("---------------------------------------");
        System.out.println("Nombre del estudiante: Gabriel Buitron Ramos");
        System.out.println("=======================================");
        scanner.close();
        
        
    }
}
