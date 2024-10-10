/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author whyra
 */
public class main {
        Murid murid = new Murid("John Doe", "S12345", 85, 90, 88);

        // Print student information
        murid.printStudentInfo();

        // Calculate and print average score
        System.out.println("Average Score: " + murid.calculateAverage());

        // Change the student ID
        murid.setCourseNumber("S54321");

        // Print updated student information
        System.out.println("\nAfter changing the student ID:");
        murid.printStudentInfo();
}
