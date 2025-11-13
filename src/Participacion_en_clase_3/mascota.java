/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class mascota {
    private String nombre;
    private String tipo;
    private String raza;
    private int edad;
    private String dueno;
    private double peso;

    public mascota() {}

    public mascota(String nombre, String tipo, String raza, int edad, String dueno, double peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.dueno = dueno;
        this.peso = peso;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDueno() { return dueno; }
    public void setDueno(String dueno) { this.dueno = dueno; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}
