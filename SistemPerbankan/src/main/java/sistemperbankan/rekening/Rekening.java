/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemperbankan.rekening;

public class Rekening {
    private String nomorRekening;
    private String namaNasabah;
    private double totalSaldo;
    
    public static int totalRekening = 0;

    public Rekening(String nomorRekening, String namaNasabah, double setoranAwal) {
        this.nomorRekening = nomorRekening;
        this.namaNasabah = namaNasabah;
        this.totalSaldo = setoranAwal;
        totalRekening++;
    }

    public void displayAccountDetails() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Nasabah: " + namaNasabah);
        System.out.println("Saldo: " + totalSaldo);
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            this.totalSaldo += jumlah;
            System.out.println("Setoran berhasil. Saldo Baru: " + this.totalSaldo);
        } else {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    public String lihatNomorRekening() {
        return nomorRekening;
    }

    public String lihatNamaNasabah() {
        return namaNasabah;
    }

    public double lihatSaldo() {
        return totalSaldo;
    }
}