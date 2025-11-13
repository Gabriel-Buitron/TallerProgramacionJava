/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U2352523
 */
public class reportehtmlalumno {
    public static void main(String[] args) {
        alumno alumno1 = new alumno("Joyce Buitron", 20, "Enfermeria", "A2025", 18, 20);
        System.out.println("<!DOCTYPE html>");
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println("<title>Reporte del Alumno</title>");
        System.out.println("</head>");
        System.out.println("<body>");
        System.out.println("<h1>Reporte del Alumno</h1");
        System.out.println("<img src='alumno.jpg' width='200' height='200'>");
        System.out.println("<p><b>Nombre:</b> " + alumno1.getNombre() + "</p>");
        System.out.println("<p><b>Edad:</b> " + alumno1.getEdad() + "</p>");
        System.out.println("<p><b>Carrera:</b> " + alumno1.getCarrera() + "</p>");
        System.out.println("<p><b>Codigo:</b> " + alumno1.getCodigo() + "</p>");
        System.out.println("<p><b>Nota1:</b> " + alumno1.getNota1() + "</p>");
        System.out.println("<p><b>Nota2:</b> " + alumno1.getNota2() + "</p>");
        System.out.println("<p><b>Analista:</b> Gabriel Buitron</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
