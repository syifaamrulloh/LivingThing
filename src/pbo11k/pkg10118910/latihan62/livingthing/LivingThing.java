/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan62.livingthing;
/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan teks abtraks
 * 
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }
    
}
