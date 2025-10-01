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
public class paenclase2menu5opciones {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int opcion;
       do {
          System.out.println("\n----- MENU 5 OPCIONES -----");
          System.out.println("1. Contador progresivo (do-while)");
          System.out.println("2. COntador regresivo (do-while)");
          System.out.println("3. Acumulador progresivo (do-while)");
          System.out.println("4. Acumulador + contador (do-while, centinela 0)");
          System.out.println("5. salir");
          System.out.println("Elija una opcion (1-5)");
          opcion = scanner.nextInt();
          switch (opcion) {
              case 1:
                  System.out.print("Ingrese limite: ");
                  int limite = scanner.nextInt();
                  if (limite >= 1){
                      int i = 1;
                      do{
                          System.out.println(i);
                          i = i + 1;
                      } while (i <= limite);
                  } else {
                      System.out.println("Limite invalido.");
                  }
                  break;
              case 2:
                  System.out.print("Ingrese inicio: ");
                  int inicio = scanner.nextInt();
                  if (inicio >= 1){
                      int j = inicio;
                      do {
                          System.out.println(j);
                          j = j - 1;
                      } while (j >= 1); 
                  } else {
                      System.out.println("Valor invalido.");
                  } 
                  break;
              case 3: 
                  System.out.print("Ingrese N: ");
                  int N = scanner.nextInt();
                  if (N >= 1){
                      int k = 1;
                      int suma = 0;
                      do {
                          suma = suma + k;
                          k = k + 1;
                      } while (k <= N);
                      System.out.println("Suma 1..." + N + " = " + suma);
                  } else {
                      System.out.println("N invalido.");
                  }
                  break;
              case 4: 
                  int numero, total = 0, cuenta = 0;
                  do {
                      System.out.print("Ingrese numero (0 para terminar): ");
                      numero = scanner.nextInt();
                      if (numero != 0) {
                          total = total + numero;
                          cuenta = cuenta + 1;
                      }
                  } while (numero != 0);
                  System.out.println("Se ingresaron " + cuenta + " numeros. Suma = " + total);
                  break;
              case 5: 
                  System.out.println("Saliendo del menu...");
                  break;
              default:
                  System.out.println("Opcion invalida.");
          }
       } while (opcion != 5);
       scanner.close();
    }
}
