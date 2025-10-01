/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerutpjava;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class paenclase2ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Pattern patron = Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$");
        String nombre = "";
        String apellidos = "";
        double sueldoMensual = 0;
        boolean datosNombre = false;
        boolean datosSueldo = false;
        int opcion; 
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Ingresar nombre y apellidos");
            System.out.println("2. Ingresar sueldo mensual");
            System.out.println("3. Elaborar boleta");
            System.out.println("4. salir");
            System.out.println("Elija una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1) {
                System.out.print("Ingrese nombres: ");
                String n = scanner.nextLine();
                Matcher mN = patron.matcher(n);
                System.out.print("Ingrese apellidos: ");
                String a = scanner.nextLine();
                Matcher mA = patron.matcher(a);
                if (mN.matches() && mA.matches()) {
                    nombre = n;
                    apellidos = a;
                    datosNombre = true;
                    System.out.println("Nombres y apellidos guardados correctamente");
                } else {
                    System.out.println("Error: solo letras y espacios permitidos.");
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese sueldo mensual: ");
                sueldoMensual = scanner.nextDouble();
                scanner.nextLine();
                if (sueldoMensual > 0) {
                    datosSueldo = true;
                    System.out.println("Sueldo registrado: S/ " + sueldoMensual);
                } else {
                    System.out.println("Sueldo invalido, debe ser mayor a 0.");
                }
            } else if (opcion == 3) {
                if (datosNombre && datosSueldo) {
                    double sueldoAnual = sueldoMensual * 12;
                    System.out.println("-------- BOLETA --------");
                    System.out.println("Empleado: " + nombre + " " + apellidos);
                    System.out.println("Sueldo mensual: S/ " + sueldoMensual);
                    System.out.println("Sueldo anual: S/ " + sueldoAnual);
                    System.out.println("------------------------");
                } else {
                    System.out.println ("Primero debe ingresar su nombre, apellidos y el sueldo.");
                }
            } else if (opcion == 4) {
                System.out.println("Programa terminado.");
            } else {
                System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}
