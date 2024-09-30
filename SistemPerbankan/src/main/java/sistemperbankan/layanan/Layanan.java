/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemperbankan.layanan;

import sistemperbankan.rekening.Rekening;
import java.util.ArrayList;
import java.util.Scanner;

public class Layanan {
    private ArrayList<Rekening> rekening = new ArrayList<>();

    public void tambahRekening() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nomor Rekening : ");
        String nomorRekening = scanner.nextLine();
        System.out.print("Masukkan Nama Nasabah : ");
        String namaNasabah = scanner.nextLine();
        System.out.print("Masukkan Jumlah Setoran Awal : ");
        double setoranAwal = scanner.nextDouble();

        Rekening tambahRekening = new Rekening(nomorRekening, namaNasabah, setoranAwal);
        rekening.add(tambahRekening);

        System.out.println("Berhasil Membuat Rekening!");
    }

    public void lihatRekening() {
        if (rekening.isEmpty()) {
            System.out.println("Tidak Ada Rekening Yang Terdaftar");
        } else {
            System.out.println("Daftar Rekening Yang Terdaftar:");
            System.out.println("-------------------------------------------------------");
            System.out.printf("| %-15s | %-20s | %-10s |\n", "Nomor Rekening", "Nama Nasabah", "Saldo");
            System.out.println("-------------------------------------------------------");
            for (Rekening account : rekening) {
                System.out.printf("| %-15s | %-20s | %-10.2f |\n", 
                                  account.lihatNomorRekening(), 
                                  account.lihatNamaNasabah(), 
                                  account.lihatSaldo());
            }
            System.out.println("-------------------------------------------------------");
        }
    }

    public void setoranRekening() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nomor Rekening : ");
        String nomorRekening = scanner.nextLine();

        Rekening rekening = temukanRekening(nomorRekening);
        if (rekening != null) {
            System.out.print("Masukkan Jumlah Setoran : ");
            double jumlah = scanner.nextDouble();
            rekening.deposit(jumlah);
        } else {
            System.out.println("Rekening Tidak Ditemukan.");
        }
    }

    public void hapusRekening() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nomor Rekening yang Ingin Dihapus: ");
        String nomorRekening = scanner.nextLine();

        Rekening rekening = temukanRekening(nomorRekening);
        if (rekening != null) {
            this.rekening.remove(rekening);
            System.out.println("Rekening dengan nomor " + nomorRekening + " berhasil dihapus.");
        } else {
            System.out.println("Rekening Tidak Ditemukan.");
        }
    }

    private Rekening temukanRekening(String nomorRekening) {
        for (Rekening account : rekening) {
            if (account.lihatNomorRekening().equals(nomorRekening)) {
                return account;
            }
        }
        return null;
    }
}