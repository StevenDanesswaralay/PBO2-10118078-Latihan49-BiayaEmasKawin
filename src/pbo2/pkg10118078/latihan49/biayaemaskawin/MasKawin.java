/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan49.biayaemaskawin;

/**
 *
 * @author  
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas: Biaya Emas Kawin
 */
public class MasKawin {
    private double harga;
    private double berat;

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double hitungMasKawin(){
        return harga * berat;
    }
}
