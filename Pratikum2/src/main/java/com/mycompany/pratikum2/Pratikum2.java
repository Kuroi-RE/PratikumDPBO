/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratikum2;
/**
 *
 * @author whyra
 */

import java.util.Scanner;

public class Pratikum2 {

    public static void main(String[] args) {
//        
//        Scanner input = new Scanner(System.in);
//
//        
//        System.out.print("Masukkan bilangan pertama: ");
//        int bilanganPertama = input.nextInt();
//
//        System.out.print("Masukkan bilangan kedua: ");
//        int bilanganKedua = input.nextInt();
//
//        System.out.print("Masukkan bilangan ketiga: ");
//        int bilanganKetiga = input.nextInt();
//
//        
//        int terkecil, tengah, terbesar;
//
//        
//        if (bilanganPertama <= bilanganKedua && bilanganPertama <= bilanganKetiga) 
//        {
//            terkecil = bilanganPertama;
//            if (bilanganKedua <= bilanganKetiga) {
//                tengah = bilanganKedua;
//                terbesar = bilanganKetiga;
//            } else {
//                tengah = bilanganKetiga;
//                terbesar = bilanganKedua;
//            }
//        } else if (bilanganKedua <= bilanganPertama && bilanganKedua <= bilanganKetiga) {
//            terkecil = bilanganKedua;
//            if (bilanganPertama <= bilanganKetiga) {
//                tengah = bilanganPertama;
//                terbesar = bilanganKetiga;
//            } else {
//                tengah = bilanganKetiga;
//                terbesar = bilanganPertama;
//            }
//        } else {
//            terkecil = bilanganKetiga;
//            if (bilanganPertama <= bilanganKedua) {
//                tengah = bilanganPertama;
//                terbesar = bilanganKedua;
//            } else {
//                tengah = bilanganKedua;
//                terbesar = bilanganPertama;
//            }
//        }
//
//        
//        System.out.println(terkecil + " " + tengah + " " + terbesar);
//
//        
//        input.close();

//        Scanner input = new Scanner(System.in);
//
//        
//        System.out.print("Masukkan jumlah sampel buah-buahan: ");
//        int jumlahSampel = input.nextInt();
//        
//        input.nextLine(); 
//        
//
//        
//        int jumlahApel = 0;
//        int jumlahJeruk = 0;
//        int jumlahMangga = 0;
//
//        
//        for (int i = 0; i < jumlahSampel; i++) {
//            
//            
//            
//            String buah = input.nextLine().toLowerCase(); 
//            
//            
//            if (buah.equals("apel")) {
//                jumlahApel++;
//            } else if (buah.equals("jeruk")) {
//                jumlahJeruk++;
//            } else if (buah.equals("mangga")) {
//                jumlahMangga++;
//            }
//        }
//
//
//        System.out.println(jumlahApel + " " + jumlahJeruk + " " + jumlahMangga);
//
//        
//        input.close();
        Scanner input = new Scanner(System.in);

        int[] bilangan = new int[11];

        // Meminta input 11 bilangan bulat dari pengguna
        System.out.println("Masukkan 11 bilangan bulat:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            bilangan[i] = input.nextInt();
        }

        
        int bilanganKe11 = bilangan[10];

        
        for (int i = 0; i < 10; i++) {
            if (bilangan[i] > bilanganKe11) {
                System.out.println("Bilangan ke-" + (i + 1) + " (" + bilangan[i] + ") lebih besar dari bilangan ke-11 (" + bilanganKe11 + ")");
            } else if (bilangan[i] < bilanganKe11) {
                System.out.println("Bilangan ke-" + (i + 1) + " (" + bilangan[i] + ") lebih kecil dari bilangan ke-11 (" + bilanganKe11 + ")");
            } else {
                System.out.println("Bilangan ke-" + (i + 1) + " (" + bilangan[i] + ") sama dengan bilangan ke-11 (" + bilanganKe11 + ")");
            }
        }

        
        input.close();
        
    }
}

//        double m[][];
//        
//        m = new double[4][4];
//        m[0][0] = 1;
//        m[1][1] = 3;
//        m[2][2] = 5;
//        m[3][3] = 7;
//        
//        System.out.println(m[0][0] + " " + m[0][1] + " " + m[0][3]);
//        System.out.println(m[1][1] + " " + m[1][2] + " " + m[1][3]);
//        System.out.println(m[2][1] + " " + m[2][2] + " " + m[2][3]);
//        System.out.println(m[3][0] + " " + m[3][1] + " " + m[3][2]);
//        double[] n = {1,2,3};
//        System.out.println(n[0]);

//        manusia[] orang = new manusia[4];
//    
//        for (int i = 0; i < orang.length; i++) {
//            orang[i] = new manusia();
//        }
//    
//        orang[0].setInfo("Hermawan", 100);
//        orang[1].setInfo("Kevin", 199);
//        orang[2].setInfo("Gilang", 189);
//        orang[3].setInfo("Uffi", 188);
//        
//        orang[0].info();
//
// Scanner input = new Scanner(System.in);
//
//        System.out.print("Masukan jumlah mil: ");
//        double mil = input.nextDouble();
//
//        double kilometers = mil * 1.6;
//
//        System.out.println(mil + " mil setara dengan " + kilometers + " kilometer.");
//        
//        input.close();