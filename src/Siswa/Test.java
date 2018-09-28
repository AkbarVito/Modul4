/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Siswa;

/**
 *
 * @author asus
 */
public class Test {
    public static void main(String[] args){
         Anggota gopal = new Anggota("A01", "Gopal", "Durian Runtuh", "XR4");
        Siswa ying = new Siswa("Gopal", "Durian Runtuh", "XR5");
        Buku matematika = new Buku("B01", "Matematika Dasar", "Sains");
        Buku english = new Buku("B02", "Bahasa Inggris", "Bahasa");
        Buku geografi = new Buku("B03", "Geografi Dasar", "Sosial");
        
        /*gopal pinjam buku */
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.setSiswa(gopal);
        pinjam1.addBuku(matematika);
        pinjam1.addBuku(geografi);
        pinjam1.tampilIdentitasPeminjam();
        pinjam1.tampilBuku();
        System.out.println("Biaya Pinjam : " + pinjam1.getBiaya());
        
        System.out.println("=============================================");
        
        /* gopal pinjam buku*/
        Peminjaman pinjam2 = new Peminjaman();
        pinjam2.setSiswa(ying);
        pinjam2.addBuku(matematika);
        pinjam2.addBuku(geografi);
        pinjam2.addBuku(english);
        pinjam2.tampilIdentitasPeminjam();
        pinjam2.tampilBuku();
        System.out.println("Biaya pinjam : "+pinjam2.getBiaya());
    }
}
