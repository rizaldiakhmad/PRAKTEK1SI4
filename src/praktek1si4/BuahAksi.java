/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1si4;

/**
 *
 * @author rizaldi
 */
public class BuahAksi {
    public static void main(String[] args) {
        Buah Mangga = new Buah();
        
        Mangga.warna="Hijau Kekuningan";
        Mangga.berat="5-1Ocm";
        Mangga.rasa="Asam Manis";
        Mangga.bentuk="Bulat Lonjong";
        Mangga.masapanen="7-8 Bulan";
        Mangga.SPACI="";
        
       Buah Apel = new Buah();
        
         Apel.warna="Hijau dan Merah Tua";
         Apel.berat="5-8cm";
         Apel.rasa="Asam & Manis";
         Apel.bentuk="Bulat Gepeng";
         Apel.masapanen="4-5 Bulan";
         Apel.SPACI="";
        
        Buah Durian = new Buah();
        
        Durian.warna="Hijau & Kuning";
        Durian.berat="30-50cm";
        Durian.rasa="Manis & Pahit";
        Durian.bentuk="Bulat/Lonjong Berduri";
        Durian.masapanen="1 - 1/2 Tahun";
        Durian.SPACI="";
        
        Mangga.perawatan();
        Apel.perawatan();
        Durian.perawatan();
       
    }
}
