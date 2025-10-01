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
public class paenclase2ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pPrimo = Pattern.compile("^P(\\d+)$"); 
        Pattern pFactorial = Pattern.compile ("^(\\d+)!$");
        String respuesta = "si";
        do { 
            System.out.print("Ingrese una expresion (ej: P23 o 8!): ");
            String expresion = scanner.next();
            Matcher mPrimo = pPrimo.matcher(expresion);
            Matcher mFact = pFactorial.matcher(expresion);
            if (mPrimo.matches()) {
                String sNum = mPrimo.group(1);
                int numero = Integer.parseInt(sNum);
                boolean esPrimo = true;
                if (numero <= 1){
                    esPrimo = false;
                } else {
                    for (int i = 2; i <= numero / 2; i = i + 1){
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }
                if (esPrimo == true){
                    System.out.println("El numero " + numero + " es primo.");
                } else {
                    System.out.println ("El numero " + numero + " no es primo.");
                }      
            } else if (mFact.matches()) {
                String sNum = mFact.group(1);
                int numero = Integer.parseInt(sNum);
                long factorial = 1;
                int i = 1;
                while (i <= numero) {
                    factorial = factorial * i;
                    i = i + 1;
                }
                System.out.println("El factorial de " + numero + " es: " + factorial);
            } else { 
                System.out.println("Formato invalido. Use P23 o 8!.");
            }
            System.out.print("¿Desea continuar (si/no)? ");
            respuesta = scanner.next();
        } while (respuesta.equals("si"));
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
