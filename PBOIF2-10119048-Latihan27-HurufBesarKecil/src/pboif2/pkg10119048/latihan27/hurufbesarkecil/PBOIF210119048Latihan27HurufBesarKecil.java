/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan27.hurufbesarkecil;

import java.util.Scanner;
/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Huruf Besar Huruf Kecil
 */
public class PBOIF210119048Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Kalimat : ");
        kalimat = scanner.nextLine();
        
        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();
        
        System.out.println("===Hasil Formating===");
        System.out.println("Huruf Besar : " + hurufBesar);
        System.out.println("Huruf Kecil : " + hurufKecil);
        
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
}
