package com.stmik.biodataleo.basic;

import java.util.Scanner;

public class main {
    public static void main (String[] args){

        //Area Inisialisasi
        String jawabanMu;
        String yes = "y";
        String no = "n";
        Scanner scan = new Scanner(System.in);

        // Area Intro
        System.out.println("=========================================================");
        System.out.println("==== STMIK Jakarta STI&K ================================");
        System.out.println("==== Sistem Informasi Strata-1 ==========================");
        System.out.println("=========================================================");
        System.out.println("==== Nama : Leo Puji Christyanto ========================");
        System.out.println("==== Kelas : 208 ========================================");
        System.out.println("==== NPM : 10419083 =====================================");
        System.out.println("=========================================================");

        // Area Utama
        System.out.println("==== Ingin mengetahui lebih lengkap biodata leo ? =======");
        System.out.print("==== Press (y/n) : ");
        jawabanMu = scan.nextLine();
        System.out.println("=========================================================");

        //Area Kondisional
        if (jawabanMu.equals(yes)) {
            System.out.println("==== Hobby : Caving & Coding ============================");
            System.out.println("==== Linkedin : @piyuid =================================");
            System.out.println("==== Github : @piyuid ===================================");
            System.out.println("=========================================================");
        } else if (jawabanMu.equals(no)) {
            System.out.println("==== Terima kasih untuk mengatakan tidak ================");
            System.out.println("==== Karena privasi saya penting ========================");
            System.out.println("=========================================================");
        } else {
            System.out.println("==== Error(1) : Kode Input Salah ========================");
            System.out.println("=========================================================");
        }
    }
}
