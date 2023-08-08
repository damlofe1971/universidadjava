/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package exepoo_01;

import exepoo_01.Entities.Book;
import exepoo_01.Services.BookService;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ExePOO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        BookService BS = new BookService(); 
        Book newer = BS.createBook();
        System.out.println(newer.toString());
    }
    
}
