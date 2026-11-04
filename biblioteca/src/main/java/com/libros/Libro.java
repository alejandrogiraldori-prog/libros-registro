package com.libros;

import java.util.Scanner;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private double precio;

    Scanner sc = new Scanner(System.in);

    public Libro(int id, String titulo, String autor, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void registrarLibro(){
        System.out.println("Dijiste el ISBN del libro");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite el titulo de este libro");
        titulo = sc.nextLine();
        System.out.println("Digite el nombre del autor del libro");
        autor = sc.nextLine();
        System.out.println("Digite el precio del libro");
        precio = sc.nextDouble();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
