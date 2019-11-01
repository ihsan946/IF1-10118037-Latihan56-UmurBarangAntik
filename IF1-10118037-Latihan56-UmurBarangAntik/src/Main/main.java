/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program menampilkan umur barang antik
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio");
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampilUmur();
        
       
    }
    
}
