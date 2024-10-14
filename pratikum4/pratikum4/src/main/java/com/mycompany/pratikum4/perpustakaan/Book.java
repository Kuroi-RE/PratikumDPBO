/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum4.perpustakaan;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author whyra
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private Queue<String> reservationQueue;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
        this.reservationQueue = new LinkedList<>();
    }

    public boolean borrowBook(User user) {
        if (available && user.canBorrow()) {
            available = false;
            user.addBorrowedBook(this);
            return true;
        }
        return false;
    }

    public boolean borrowBook(User user, String priority) {
        if (available && user.canBorrow()) {
            available = false;
            user.addBorrowedBook(this);
            return true;
        } else {
            addToReservationQueue(user.getUserId(), priority);
            System.out.println("User " + user.getUserId() + " added to the reservation queue with priority: " + priority);
            return false;
        }
    }

    public void addToReservationQueue(String userId, String priority) {
        reservationQueue.add(userId + "-" + priority);
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + available);
    }
    
    // Override method toString untuk menampilkan detail buku secara benar
    @Override
    public String toString() {
        return "Judul: " + title + ", Penulis: " + author + ", ISBN: " + isbn;
    }
}

