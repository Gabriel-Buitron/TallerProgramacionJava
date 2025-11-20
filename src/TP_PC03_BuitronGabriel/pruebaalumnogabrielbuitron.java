/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_PC03_BuitronGabriel;

/**
 *
 * @author GABRIEL
 */
public class pruebaalumnogabrielbuitron {
    public static void main(String[] args) {

        // Crear instancia usando el constructor completo
        alumnogabrielbuitron alumno = new alumnogabrielbuitron(
                "foto.jpg",
                "Gabriel Buitron",
                20,
                15, 18, 17,
                16
        );

        // Usar un setter para modificar un dato
        alumno.setPractica1(20);

        // Usar un getter para obtener un dato
        String nombreAlumno = alumno.getNombre();

        // Mostrar estado final del objeto
        System.out.println("===== REPORTE DEL ALUMNO =====");
        System.out.println("Nombre: " + nombreAlumno);
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Foto: " + alumno.getFoto());
        System.out.println("Práctica 1: " + alumno.getPractica1());
        System.out.println("Práctica 2: " + alumno.getPractica2());
        System.out.println("Práctica 3: " + alumno.getPractica3());
        System.out.println("Examen Final: " + alumno.getExamenFinal());
    }
}
