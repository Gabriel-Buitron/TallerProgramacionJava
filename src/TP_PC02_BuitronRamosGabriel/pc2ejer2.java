/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_PC02_BuitronRamosGabriel;

import java.util.Scanner;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class pc2ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nombreProyecto = "";
        String prioridad = "";
        int tareasCompletadas = 0;
        double presupuestoConsumido = 0;
        int numeroSemana = 0;
        System.out.println("=== ENTRADA DE DATOS ===");
        System.out.println("dato\t\t\tOpcion\tValor Ingresado");
        System.out.print("Nombre del Proyecto\t1\t");
        nombreProyecto = scanner.nextLine();
        System.out.print("Prioridad\t\t1\t");
        prioridad = scanner.nextLine();
        System.out.print("Tareas Completadas\t2\t");
        tareasCompletadas = scanner.nextInt();
        System.out.print("Presupuesto Consumido\t2\t");
        presupuestoConsumido = scanner.nextDouble();
        System.out.print("Numero de Semana\t2\t");
        numeroSemana = scanner.nextInt();
        double rendimiento = 0;
        if (numeroSemana > 0) {
            rendimiento = tareasCompletadas / (double) numeroSemana;
        }
        System.out.println();
        System.out.println("REPORTE ");
        System.out.println("#################################################################");
        System.out.println("# REPORTE DE ESTADO DEL PROYECTO AGIL                           #");
        System.out.println("#################################################################");
        System.out.println("# Nombre del Proyecto:  |" + nombreProyecto + "                 #");
        System.out.println("Prioridad del Proyecto: |" + prioridad + "                      #");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("# METRICA               | VALOR             | OBSERVACIONES     #");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("# Tareas completadas:   |" + tareasCompletadas + "              | Buen ritmo     #");
        System.out.println("# Presupuesto Consumido:     | S/. " + presupuestoConsumido + "     |           #");
        System.out.println("# Semana en Curso:      | seman " + numeroSemana + "              |            #");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("# Analista: Buitron Ramos Gabriel");
        System.out.println("####################################################################################");
        System.out.println("Calculo: El rendimiento se calculo como " + tareasCompletadas +        "Tareas / " + numeroSemana + " semanas = " + rendimiento + ".");
        scanner.close();
    }
}
