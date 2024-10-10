/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratikum3;

/**
 *
 * @author whyra
 */
public class PassedByValue {
    public static void main(String[] args) {
        int x, y;
        testPass z;
        
        z = new testPass(50, 100);
        x = 10;
        y = 20;
        
        System.out.println("NIlai sebelum passed by Value: ");
        System.out.println("x = " + x);
        System.out.println("x = " + y);
        
//         Passed by Value

        z.Calculate(x, y);
        System.out.println("Nilai setelah passed by Value: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        System.out.println("Nilai sebelum passed by reference: ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);
        
        z.calculate(z);
        
        System.out.println("Nilai sesudah passed by reference");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);
    }
}
