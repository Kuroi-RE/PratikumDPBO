/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum4.perpustakaan;

/**
 *
 * @author whyra
 */

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String userId;
    private String userType;
    private List<Book> borrowedBooks;
    private int borrowLimit;
    private int borrowDuration;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
        this.borrowLimit = 3;  
        this.borrowDuration = 7; 
    }

    public User(String name, String userId, String userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;
        this.borrowedBooks = new ArrayList<>();

        if (userType.equals("Student")) {
            this.borrowLimit = 5;
            this.borrowDuration = 14;
        } else if (userType.equals("Lecturer")) {
            this.borrowLimit = 10;
            this.borrowDuration = 30;
        } else {
            this.borrowLimit = 3;
            this.borrowDuration = 7;
        }
    }

    public boolean canBorrow() {
        return borrowedBooks.size() < borrowLimit;
    }

    public void addBorrowedBook(Book book) {
        if (canBorrow()) {
            borrowedBooks.add(book);
            System.out.println(name + " has borrowed the book: " + book);
        } else {
            System.out.println(name + " has reached the borrowing limit.");
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed books by " + name + ":");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

    public String getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }
}   
