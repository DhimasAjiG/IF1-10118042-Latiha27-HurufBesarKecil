/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan27.hurufbesarkecil;
import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Mengatur huruf besar dan huruf kecil dalam kalimat
 */
public class IF110118042Latihan27HurufBesarKecil {

    public static void main(String[] args) {
       String kalimat;
        String hurufBesar;
        String hurufKecil;
        
        //input
        System.out.print("Masukkan Kalimat  : ");
        Scanner tempKalimat = new Scanner(System.in);
        kalimat = tempKalimat.nextLine();
        System.out.println();
        
        //output
        hurufBesar = kalimat.toUpperCase();
        hurufKecil = kalimat.toLowerCase();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar\t: " + hurufBesar);
        System.out.println("Huruf Kecil   \t: " + hurufKecil);
        
    }
    
}
