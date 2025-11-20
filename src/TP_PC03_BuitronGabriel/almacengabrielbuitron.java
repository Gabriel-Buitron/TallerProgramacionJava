/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_PC03_BuitronGabriel;

/**
 *
 * @author GABRIEL BUITRON - U23252523
 */
public class almacengabrielbuitron {
    private productogabrielbuitron[] productos;
    private int cantidad;

   
    public almacengabrielbuitron() {
        productos = new productogabrielbuitron[8];
        cantidad = 0;
    }

    
    public void agregarProducto(productogabrielbuitron nuevo) {
        if (cantidad < 8) {
            productos[cantidad] = nuevo;
            cantidad++;
        } else {
            System.out.println("ERROR: No se pueden agregar más de 8 productos.");
        }
    }

    public productogabrielbuitron buscarProducto(String sku) {
        for (int i = 0; i < cantidad; i++) {
            if (productos[i].getSku().equals(sku)) {
                return productos[i];
            }
        }
        return null; 
    }

    public void mostrarInventario() {
        System.out.println("===== INVENTARIO DEL ALMACÉN =====");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(productos[i].toString());
        }
        System.out.println("===================================");
    }
}
