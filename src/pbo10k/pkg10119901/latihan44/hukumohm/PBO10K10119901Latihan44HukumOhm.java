/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menampilkan hasil perhitungan hukum ohm
 *
 */
public class PBO10K10119901Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai b       = new Baterai();
        
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan beda potensial pada ujung-ujung kawat penghantar tersebut asalkan suhu kawat dijaga konstan.");
        
        b.Baterai(3, 12);
        
        System.out.println();
        System.out.println("Kuat Arus \t : " + b.getKuatArus());
        System.out.println("Hambatan \t : " + b.getHambatan());
        System.out.println("Hasil Tegangan \t : " + b.hitungTegangan());
    }
    
}
