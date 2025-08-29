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
public class participacionenclase1ejerc1 {
    public static void main(String[] args) {
       /**
        * Es un programa que calcula la distancia recorrida por la luz en N días 
        * Se usa la constante de la velocidad de la luz y el ingreso de datos se usara Scanner
        */
       //Creamos un objeto Scanner para poder leer los datos
       Scanner scanner = new Scanner(System.in);  
       
       //Fijamos la constante de la velocidad de la luz (m/s)
       final double Velocidad_Luz = 299792458; 
       
       //Pedimos al usuario que ingrese la cantidad de dias 
       System.out.print("Ingrese el número de días: ");
       int dias = scanner.nextInt();
       
       /*
       * Como seria el cálculo 
       * 1 día = 24 Horas = 60 minutos = 3600 segundos 
       * entoces para encontrar los segundos que hay en un dia multiplicariamos 24 horas * 3600 segundos 
       * distacia = velocidad * tiempo  
       */
       
       double segundos = dias * 24 * 3600;
       double distancia = Velocidad_Luz * segundos;
       
       // Mostramos el resultado 
       System.out.println("La luz recorre en " + dias + " días una distancia de: " + distancia + " metros");
       
       
       // Cerramos el scanner 
       scanner.close();
       
       
    }
}
