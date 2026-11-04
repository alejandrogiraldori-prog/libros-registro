package com.libros;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          try (Connection conexion = ConexionBD.conectar()) {
        if (conexion != null) {
            System.out.println("base de datos H2 conectada con exito");
        }
         } catch (SQLException e) {
        System.err.println("error al conectar a la base de datos: " + e.getMessage());
         }
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Registro de libros");
            System.out.println("Digite 1 para registrar o dos para parar");
             opcion= sc.nextInt();

            if(opcion==1){
                Libro libro = new Libro(1, null, null, 21800);
                libro.registrarLibro();
            }else{
                System.out.println("Menu cerrado");
            }

        }while(opcion==1);
    }
}