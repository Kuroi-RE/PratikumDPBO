/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided;

/**
 *
 * @author whyra
 */
public class Murid {
    private String studentName;
    private String studentId;
    private int korean;
    private int english;
    private int math;

    // Constructor
    public Murid(String name, String id, int koreanScore, int englishScore, int mathScore) {
        this.studentName = name;
        this.studentId = id;
        this.korean = koreanScore;
        this.english = englishScore;
        this.math = mathScore;
    }

    // Method to calculate average of scores
    public double calculateAverage() {
        return (korean + english + math) / 3.0;
    }

    // Method to get student's information
    public String getStudentInfo() {
        return "Name: " + studentName + "\nID: " + studentId + 
               "\nKorean: " + korean + 
               "\nEnglish: " + english + 
               "\nMath: " + math;
    }

    // Method to change the student's ID
    public void setCourseNumber(String newId) {
        this.studentId = newId;
    }

    // Method to print student information
    public void printStudentInfo() {
        System.out.println(getStudentInfo());
    }
}
