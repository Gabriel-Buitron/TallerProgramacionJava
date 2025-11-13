/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class empleado {
    private String nombre;
    private String cargo;
    private String dni;
    private int edad;
    private double sueldo;
    private String area;

    public empleado() {}

    public empleado(String nombre, String cargo, String dni, int edad, double sueldo, String area) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dni = dni;
        this.edad = edad;
        this.sueldo = sueldo;
        this.area = area;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
}
