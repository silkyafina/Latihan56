 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166017.pbo.lat56;

/**
 *
 * @author User
 * Nama : Silky Afina Saly 
 * NIM : 22166017 
 * Mata Kuliah : Pemrograman Berorientasi Objek 1 
 * Program Studi: Sistem Informasi 
 * Semester : 3
 */
// membuat super class barang antik
public class BarangAntik {
    int umur;
 
// konstruktor untuk menginisialisasi variabel
    public BarangAntik(int umur){    
        this.umur= umur;
    }   
//  metode getter dan setter
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
// sub class radio
class Radio extends BarangAntik{
    private String name;
    
// metode getter dan setter
     public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
// konstruktor
    public Radio(int umur, String name) {
         super(umur);
         this.name = name;
        }

// pemanggilan untuk menampilkan informasi produk
    public static void main(String[] args) {
        Radio radio = new Radio(234, "Radio AM");
        System.out.println("Nama Barang Antik: "+radio.name);
        System.out.println("Umur barang antik ini adalah: "+radio.umur+" tahun");
    }
}
    



   
