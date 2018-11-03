/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2AndroidComplete;

/**
 *
 * @author irfanasidiq
 */
public class LatihanConstructor {
    
    String nama;
    String data;
    int angka;
    
    public LatihanConstructor(){
        
    }
    
    public LatihanConstructor(String nama){
        this.nama = nama;
    }

    public LatihanConstructor(String nama, String data){
        this.nama = nama;
        this.data = data;
    }
    
    public LatihanConstructor(String nama, String data, int angka){
        this.nama = nama;
        this.data = data;
        this.angka = angka;
    }
}
