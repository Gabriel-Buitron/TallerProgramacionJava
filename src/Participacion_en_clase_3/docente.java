/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class docente {
    private String nombre;
    private String especialidad;
    private String grado;
    private int experiencia;
    private String correo;
    private String telefono;

    public docente() {}

    public docente(String nombre, String especialidad, String grado, int experiencia, String correo, String telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.grado = grado;
        this.experiencia = experiencia;
        this.correo = correo;
        this.telefono = telefono;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }

    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
