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
public class participacionenclase1ejerc2 {
    public static void main(String[] args) {
        
        /**
        * Debemos generar una boleta de venta para 2 productos.
        * Los descuentos deben ser los siguientes: 
        *  - Un 5% si el cliente se llama ANA o JUAN (utilizando String.equals con to UpperCase()). 
        *  - Un 2% adicional por cada producto cuyo nombre contenga "GAMER" (Utilizando contains con toUpperCase()).
        */
        
        // colocamos el lector Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos los Datos del cliente 
        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();
        
        // Datos del Primer Producto 
        System.out.print("Ingrese el nombre del primer producto: ");
        String producto1 = scanner.nextLine();
        
        System.out.print("Ingrese el precio del primer producto: ");
        double precio1 = scanner.nextDouble();
        
        System.out.print("Ingrese la cantidad del primer producto: ");
        int cantidad1 = scanner.nextInt();
        scanner.nextLine(); // Colocamos este nextLine para limpiar el buffer despues de leer los numeros 
        
        // Datos del Segundo Producto
        System.out.print("Ingrese el nombre del segundo producto: ");
        String producto2 = scanner.nextLine();
        System.out.print("Ingrese el precio del segundo producto: ");
        double precio2 = scanner.nextDouble();
        System.out.print("Ingrese la cantidad del segundo producto: ");
        int cantidad2 = scanner.nextInt();
        scanner.nextLine(); // Otra vez para limpiar el buffer 
        
        
        /* Hallamos los subtotales de los productos comprados */
        double subtotal1 = precio1 * cantidad1;
        double subtotal2 = precio2 * cantidad2; 
        double subtotal = subtotal1 + subtotal2;
        
        // Colocamos un primer descuento por si no cumplen las condiciones pedidas 
        double descuento = 0.0; 
        
        // Ahora aplicamos un descuento del 5% si el cliente se llama ANA o JUAN 
        if (cliente.toUpperCase().equals("ANA") || cliente.toUpperCase().equals("JUAN")){
            descuento = descuento + (0.05 * subtotal);
        }
        
        // Ahora aplicamos un descuento del 2% si el nombre del producto contiene la palabra "GAMER"
        if (producto1.toUpperCase().contains("GAMER")){
            descuento = descuento + (0.02 * subtotal1);
        }
        if (producto2.toUpperCase().contains("GAMER")){
            descuento = descuento + (0.02 * subtotal2); 
        }
        
        // Ahora realizamos el total a pagar 
        double total = subtotal - descuento;
        
        
        /* Ahora creamos la impresion de la boleta */
        System.out.println("\n====== BOLETA DE VENTA ======");
        System.out.println("Cliente: " + cliente.toUpperCase());
        System.out.println("-------------------------------");
        System.out.println("Producto 1: " + producto1 + " | Cant: " + cantidad1 
                            + " | Precio: " + precio1 + " | Subtotal1: " + subtotal1);
        System.out.println("Producto 2: " + producto2 + " | Cant: " + cantidad2 
                            + " | Precio: " + precio2 + " | Subtotal2: " + subtotal2);
        System.out.println("--------------------------------");
        System.out.println("El subtotal es: " + subtotal);
        System.out.println("Su descuento es: " + descuento);
        System.out.println("Su total a pagar es: " + total);
        System.out.println("==============================\n");
        
        scanner.close(); // Cerramos el scanner 
    }
}
