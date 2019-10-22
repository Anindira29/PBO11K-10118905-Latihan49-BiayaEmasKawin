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
public class PBO11K10118905Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas e =new Emas();
        e.setMahar(15.7);
        e.setHarga(570000);
        System.out.println("====Program Menghitung Mahar======");
	System.out.println("Harga Emas\t: Rp."+e.getHarga());
	System.out.println("Jumlah Emas\t: "+e.getMahar()+" Gram");
	System.out.println("Jumlah harga yang harus dibayar : Rp."+ e.hitungHarga(e.getMahar(), e.getHarga()));
    }
}
