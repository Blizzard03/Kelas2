/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kelas3.Main_Class;

import Kelas2.Buku_Class.Buku_Class;

/**
 *
 * @author mariq
 */
public class Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku_Class buku1 = new Buku_Class("Pelajaran", 2011, 1000, 7);
        Buku_Class buku2 = new Buku_Class("Komik", 2007, 2000, 5);
        Buku_Class buku3 = new Buku_Class("Majalah", 2015, 1500, 2);

        System.out.println("Buku 1:");
        buku1.tampilkanInfo();
        System.out.println();

        System.out.println("Buku 2:");
        buku2.tampilkanInfo();
        System.out.println();

        System.out.println("Buku 3:");
        buku3.tampilkanInfo();
    }

}
