/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemperbankan;

import sistemperbankan.layanan.Layanan;
import java.util.Scanner;

public class SistemPerbankan { 
    public static void main(String[] args) {
        Layanan layanan = new Layanan();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Selamat Datang di Dashboard Bank ---");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Lihat Rekening");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Hapus Rekening");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    layanan.tambahRekening();
                    break;
                case 2:
                    layanan.lihatRekening();
                    break;
                case 3:
                    layanan.setoranRekening();
                    break;
                case 4:
                    layanan.hapusRekening();
                    break;
                case 5:
                    System.out.println("Sampai Jumpa...");
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid. Silahkan Coba Lagi.");
            }
        }
    }
}
