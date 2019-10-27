/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA  : Guntur Maulana Ibrahim
 * KELAS : IF 1
 * NIM   : 10118032
 * Deskripsi Program : Menampilkan output Nilai Mahasiswa.
 */
public class PBO110118032Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn1 =  new Scanner(System.in);
        Scanner scn2 =  new Scanner(System.in);
        Scanner scn3 =  new Scanner(System.in);
        
        Nilai nilai = new Nilai();
        nilai.getNA();
        
        System.out.print("Quiz\t = ");
        nilai.setQuiz(scn1.nextDouble());
        System.out.print("UTS\t = ");
        nilai.setUTS(scn2.nextDouble());
        System.out.print("UAS\t = ");
        nilai.setUAS(scn3.nextDouble());
        
        System.out.println("\nNilai Akhir "+nilai.nilaiAkhir());
        System.out.println("\nIndeks = "+nilai.Indeks());
        System.out.println("Keterangan = "+nilai.aturanKeterangan());
        
    }
    
}
