/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum4.perpustakaan;

/**
 *
 * @author whyra
 */

public class Main {
     public static void main(String[] args) {
         
        User alice = new User("Alice", "S001", "Student");
        User bob = new User("Bob", "D001", "Lecturer");

        Book javaBook = new Book("Java Programming", "James Gosling", "123-456789");
        Book pythonBook = new Book("Python 101", "Guido van Rossum", "987-654321");
        
        javaBook.borrowBook(alice);  
        javaBook.borrowBook(bob, "High");  
        
        alice.displayBorrowedBooks();
        bob.displayBorrowedBooks();
    }
}
    