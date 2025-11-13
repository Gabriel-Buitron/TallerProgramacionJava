/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class sem12ejer2 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("foto1.jpg", "Juan Perez", 19, 15, 16, 17, 20);
        double suma = alumno.getPractica1() + alumno.getPractica2() + alumno.getPractica3() + alumno.getExamenFinal();
        double promedio = suma / 4.0;
        
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println("<title>Reporte del Alumno</title>");
        System.out.println("</head>");
        System.out.println("<body>");
        System.out.println("<h1>Reporte de Notas</h1>");
        System.out.println("<p><b>Nombre:</b> " + alumno.getNombre() + "</p>");
        System.out.println("<p><b>Edad:</b> " + alumno.getEdad() + "</p>");
        System.out.println("<table border='1'>");
        System.out.println("<tr><th>Práctica 1</th><th>Práctica 2</th><th>Práctica 3</th><th>Examen Final</th><th>Promedio</th></tr>");
        System.out.println("<tr>");
        System.out.println("<td>" + alumno.getPractica1() + "</td>");
        System.out.println("<td>" + alumno.getPractica2() + "</td>");
        System.out.println("<td>" + alumno.getPractica3() + "</td>");
        System.out.println("<td>" + alumno.getExamenFinal() + "</td>");
        System.out.println("<td>" + promedio + "</td>");
        System.out.println("</tr>");
        System.out.println("</table>");
        System.out.println("<p><b>Analista:</b> Gabriel Buitron </p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
class Alumno {
    private String foto;
    private String nombre;
    private int edad; 
    private int practica1; 
    private int practica2;
    private int practica3;
    private int examenFinal; 
    
    public Alumno(String foto, String nombre, int edad, int practica1, int practica2, int practica3, int examenFinal){
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3; 
        this.examenFinal = examenFinal;
    }
    public String getFoto() { return foto; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public int getPractica1() { return practica1; }
    public int getPractica2() { return practica2; }
    public int getPractica3() { return practica3; }
    public int getExamenFinal() { return examenFinal; }
    public void setFoto(String foto) { this.foto = foto; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setPractica1(int practica1) { this.practica1 = practica1; }
    public void setPractica2(int practica2) { this.practica2 = practica2; }
    public void setPractica3(int practica3) { this.practica3 = practica3; }
    public void setExamenFinal(int examenFinal) { this.examenFinal = examenFinal; }
}
