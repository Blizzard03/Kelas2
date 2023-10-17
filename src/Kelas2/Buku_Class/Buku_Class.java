/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kelas2.Buku_Class;

/**
 *
 * @author mariq
 */
public class Buku_Class {
     private String jenis;
    private int keluaran;
    private int sewaPerHari;
    private int batas;

    public Buku_Class() {
        this.jenis = "";
        this.keluaran = 0;
        this.sewaPerHari = 0;
        this.batas = 0;
    }

    public Buku_Class(String jenis) {
        this.jenis = jenis;
        this.keluaran = 0;
        this.sewaPerHari = 0;
        this.batas = 0;
    }

    public Buku_Class(String jenis, int keluaran) {
        this.jenis = jenis;
        this.keluaran = keluaran;
        this.sewaPerHari = 0;
        this.batas = 0;
    }

    public Buku_Class(String jenis, int keluaran, int sewaPerHari) {
        this.jenis = jenis;
        this.keluaran = keluaran;
        this.sewaPerHari = sewaPerHari;
        this.batas = 0;
    }

    public Buku_Class(String jenis, int keluaran, int sewaPerHari, int batas) {
        this.jenis = jenis;
        this.keluaran = keluaran;
        this.sewaPerHari = sewaPerHari;
        this.batas = batas;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setKeluaran(int keluaran) {
        this.keluaran = keluaran;
    }

    public void setSewaPerHari(int sewaPerHari) {
        this.sewaPerHari = sewaPerHari;
    }

    public void setBatas(int batas) {
        this.batas = batas;
    }

    public String getJenis() {
        return jenis;
    }

    public int getKeluaran() {
        return keluaran;
    }

    public int getSewaPerHari() {
        return sewaPerHari;
    }

    public int getBatas() {
        return batas;
    }

    public void tampilkanInfo() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Keluaran: " + keluaran);
        System.out.println("Sewa/hari: Rp " + sewaPerHari);
        System.out.println("Batas: " + batas + " hari");
    }
}
