/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum3.modul3;

/**
 *
 * @author whyra
 */
public class Student {
    String studentName;
    String studentId;
    int korean;
    int english;
    int math;
    
    public int calculateAverage() {
        int average = (korean + english + math) / 3;
        return average;
    }
    
    public void printStudentInfo() {
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Matkul Korea: " + korean);
        System.out.println("Matkul English: " + english);
        System.out.println("Matkul Math: " + math);
    }
    
    public void changeStudentId(String newId) {
        studentId = newId;
    }
}
