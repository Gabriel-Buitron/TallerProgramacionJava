/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerutpjava;

import java.util.Scanner;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class paenclase2contadorprogresivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite;
        System.out.print("Ingrese el limite entero mayor o igual a 1: ");
        limite = scanner.nextInt();
        int i = 1;
        if (limite < 1) { 
            System.out.println("Limite invalido debe ser mayor o igual a 1.");            
        } else {
            do {
                System.out.println(i);
                i = i + 1;
            } while (i <= limite);
        }
        scanner.close();
    }
}
