/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_en_clase_3;

/**
 *
 * @author GABRIEL BUITRON -23252523
 */
public class libro {
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private int paginas;
    private double precio;
    
    public libro() {}
    
    public libro(String titulo, String autor, String genero, String isbn, int paginas, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.paginas = paginas;
        this.precio = precio;
    }
    public String getTitulo(){ return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    
    public String getIsbn() {return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    public int getPaginas() { return paginas; }
    public void setPaginas(int paginas) { this.paginas = paginas; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
