/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg49.biayaemaskawin;

/**
 *
 * @author 
 * Nama     : Permai Ramadhan
 * Kelas    : PBO2
 * NIM      : 10118060
 * Latihan ini berisi tentang bagaimana menghitung harga emas kawin dari
 * harga emas yang sudah ditentukan
 */
public class PBO210118060LatihanKe49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmasKawin ek = new EmasKawin();
        ek.setHargaPerGram(570000);
        ek.setBerat(15.7);
        
        System.out.println("========Hitung Harga Emas Kawin========\n");
        System.out.println("Harga Emas Per Satu Gram : Rp. " + 
                ek.getHargaPerGram());
        System.out.println("Berat Emas yang akan dibeli : " + ek.getBerat() 
                + " gram");
        System.out.println("Total bayar : Rp. " + ek.hitungHargaEmas());
    }
    
}
