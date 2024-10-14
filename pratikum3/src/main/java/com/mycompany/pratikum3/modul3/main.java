/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum3.modul3;

/**
 *
 * @author whyra
 */


public class main {
    public static void main(String[] args) {
        
        
        Student student = new Student();
        
        student.studentId = "2311104026";
        student.studentName = "Satria Ramadhan";
        student.english = 95;
        student.korean = 88;
        student.math = 89;
        
        
        student.printStudentInfo();
        System.out.println("Rata-rata nilai adalah: " + student.calculateAverage());
        
        
        
    }
}
