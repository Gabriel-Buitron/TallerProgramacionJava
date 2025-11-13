/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class sem12ejer1 {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("foto1.jpg", "Juan Perez", 19, 15, 16, 17, 20);
        System.out.println("=== DATOS DEL ALUMNO ===");
        System.out.println("Foto: " + a1.getFoto());
        System.out.println("Nombre: " + a1.getNombre());
        System.out.println("Edad: " + a1.getEdad());
        System.out.println("Practica 1: " + a1.getPractica1());
        System.out.println("Practica 2: " + a1.getPractica2());
        System.out.println("Practica 3: " + a1.getPractica3());
        System.out.println("Examen Final: " + a1.getExamenFinal());
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