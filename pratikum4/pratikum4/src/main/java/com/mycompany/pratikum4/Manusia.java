/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum4;

/**
 *
 * @author whyra
 */
public class Manusia {
    private String nama;
    private int umur;
    
    public Manusia() {
        nama = "";
    }
    
    public Manusia(String a) {
        nama = a;
    }
    
    public Manusia(String a, int b) {
        nama = a;
        umur = b;
    }
    
    public void SetNama(String a) {
        nama = a;
    }
    
    public String GetNama() {
        return nama;
    }
    
    public void SetUmur(int a) {
        umur = a;
    }
    public int GetUmur() {
        return umur;
    }
    
}
