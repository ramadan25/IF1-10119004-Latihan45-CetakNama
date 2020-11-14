/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan45.cetaknama;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini menampilkan cetak nama
 */
class Cetak {
     private int jmlCetak;
    private String nama;
    
    public int getJmlCetak() {
        return this.jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama) {
        System.out.println("Nama anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak");
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". " + nama);
        }
    }
    
}
