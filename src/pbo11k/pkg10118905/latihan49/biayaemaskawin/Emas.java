/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan49.biayaemaskawin;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Menghitung Biaya Emas Kawin
 */
public class Emas {
    private double mahar;
    private double harga;
    
    public double getMahar() {
	return mahar;
    }
    
    public void setMahar(double mahar) {
	this.mahar = mahar;
    }
	
    public double getHarga() {
        return harga;
    }
	
    public void setHarga(double harga) {
        this.harga = harga;
    }
	    
    public double hitungHarga(double emas, double harga) {
        return emas * harga;
    }
}
