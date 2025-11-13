/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class alumno {
    private String nombre;
    private int edad;
    private String carrera;
    private String codigo;
    private int nota1;
    private int nota2;
    
    public alumno() {}
    
    public alumno(String nombre, int edad, String carrera, String codigo, int nota1, int nota2){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public String getNombre(){ return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    
    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    
    public String getCodigo() {return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    
    public int getNota1() { return nota1; }
    public void setNota1(int nota1) { this.nota1 = nota1; }
    
    public int getNota2() { return nota2; }
    public void setNota2(int nota2) { this.nota2 = nota2; }
}
