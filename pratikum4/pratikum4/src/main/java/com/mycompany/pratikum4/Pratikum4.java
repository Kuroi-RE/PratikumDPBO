/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratikum4;

/**
 *
 * @author whyra
 */
public class Pratikum4 {
    public static void main(String[] args) {
//        Lagu
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();
            
        d.IsiParam("Salman Bumiayu");
        e.IsiParam("Lugu", "Nadya");
            
        d.cetakKeLayar();
        e.cetakKeLayar();
        
//        Manusia
        Manusia arrMns[] = new Manusia[3];
    
        Manusia objMns1 = new Manusia();
    
        objMns1.SetNama("Markonah");
        objMns1.SetUmur(76);
        
        Manusia objMns2 = new Manusia("Mat Conan");
        
        Manusia objMns3 = new Manusia("Bajuri", 13);
        
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[3] = objMns3;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Nama = " + arrMns[i]);

        } 
        
    }
}
