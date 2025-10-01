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
public class paenclase2ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern patron = Pattern.compile("^([A-Za-z])([A-Za-z])=(\\d+)$");
        String expresion;
        Matcher matcher;
        do {
            System.out.print("Ingrese la expresion en formato ab=N (ej: xy=4): ");
            expresion = scanner.next();
            matcher = patron.matcher(expresion);
            if (!matcher.matches()) {
                System.out.println("Formato invalido deber ser como el ejemplo: xy=4");
            }  
        } while (!matcher.matches());
        String aStr = matcher.group(1);
        String bStr = matcher.group(2);
        String nStr = matcher.group(3);
        int N = Integer.parseInt(nStr);
        char a = Character.toLowerCase(aStr.charAt(0));
        char b = Character.toLowerCase(bStr.charAt(0));
        if (N <= 0) {
            System.out.println("No hay filas que mostrar (N debe ser > 0)");
            scanner.close();
            return;
        }
        System.out.println(Character.toUpperCase(a));
        int fila = 2;
        while (fila <= N) {
            String linea = "";
            if (fila % 2 == 1){
                int pos = 1;
                while (pos <= fila){
                    if (pos % 2 == 1){
                        linea = linea + a; 
                    } else {
                        linea = linea + b;
                    }
                    pos = pos + 1;
                }
            } else {
                int pos = 1;
                while (pos <= fila) {
                    if (pos % 2 == 1){
                        linea = linea + b;
                    } else {
                        linea = linea + a;
                    }
                    pos = pos + 1;
                }
            }
            System.out.println(linea);
            fila = fila + 1;
        }
        scanner.close();
    }
}
