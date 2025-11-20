/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_PC03_BuitronGabriel;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class productogabrielbuitron {
    private String sku;
    private String nombre;
    private double precio;
    private int stock;

    
    public productogabrielbuitron(String sku, String nombre, double precio, int stock) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public String getSku() { 
        return sku; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public double getPrecio() { 
        return precio; 
    }
    public int getStock() { 
        return stock; 
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "SKU: " + sku + " - " + nombre + " (Stock: " + stock + ")";
    }
}
