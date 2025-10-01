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
public class paenclase2whileimprimirinfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero para la tabla: ");
        int num = scanner.nextInt();
        int i = 1;
        while (i <= 10){
            System.out.println(num + " x " + i + " = " + (num * i));
            i = i + 1;
        }
        scanner.close();
    }
}
