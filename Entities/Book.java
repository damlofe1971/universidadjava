/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepoo_01.Entities;

/**
 *
 * @author Diego
 */
public class Book {
    private int ISBN;
    private String Title;
    private String Author;
    private int Pages;

    public Book() {
    }

    public Book(int ISBN, String Title, String Author, int Pages) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.Author = Author;
        this.Pages = Pages;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author + ", Pages=" + Pages + '}';
    }
    
    
}
