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
public class paenclase2ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creamos un codigo para el correo: algo@algo.algo
        Pattern patronCorreo = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        String correo;
        String clave; 
        int intentos = 0; 
        boolean acceso = false ;
        while (intentos < 5 && acceso == false) {
            System.out.print("Ingrese su correo electronico: ");
            correo = scanner.next();
            System.out.print("Ingrese su clave: ");
            clave = scanner.next();
            Matcher mCorreo = patronCorreo.matcher(correo);
            if (mCorreo.matches() && clave.equals("P@55w0rd")) {
                System.out.println("Bienvenido al sistema");
                acceso = true;  
            } else { 
                System.out.println("Acceso denegado");
                intentos = intentos + 1;
            } 
        }
        if (acceso == false) {
            System.out.println("Cuenta suspendida");
        }
        scanner.close();
    }
}
