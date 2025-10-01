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
public class paenclase2contadorregresivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio;
        System.out.print("Ingrese un numero incial: ");
        inicio = scanner.nextInt();
        if (inicio < 1){
            System.out.println("Valor invalido debe ser mayor o igual a 1.");        
        } else{
            int i = inicio;
            do {
                System.out.println(i);
                i = i - 1;
            } while (i >= 1);
        } 
        scanner.close();
    }
}
