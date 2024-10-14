/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum4;

/**
 *
 * @author whyra
 */
public class Lagu {
    String pencipta;
    String judul;
    
    void IsiParam(String params) {
        judul = params;
        pencipta = "tidak di ketaui";
    }
    
    void IsiParam(String param1, String param2) {
        judul = param1;
        pencipta = param2;
    }
    
    void cetakKeLayar() {
        System.out.println("Judul : " + judul + " Pencipta " + pencipta);
    }
}
