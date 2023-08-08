/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepoo_01.Services;

import exepoo_01.Entities.Book;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class BookService {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Book createBook() {
        System.out.println("enter the ISBN");
        int ISBN = read.nextInt();
        System.out.println("enter the Title");
        String Title = read.next();
        System.out.println("enter the Author");
        String Author = read.next();
        System.out.println("enter number of pages");
        int Pages = read.nextInt();
        return new Book(ISBN,Title,Author,Pages);
    }
}


