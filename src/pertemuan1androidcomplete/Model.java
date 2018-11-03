/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1androidcomplete;

/**
 *
 * @author admin
 */
public class Model {
    private String nama;
    private String alamat;
    private int usia;
    private int nilai1;
    private int nilai2;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setUsia(int usia){
        this.usia = usia;
    }
    
    public String getData(){
        return "nama : "+nama+
               "\nalamat : "+alamat+
               "\nusia : "+usia;
    }
    
    public void setData(String nama,
                        String alamat, 
                        int usia){
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
    }
    
    public void setAngka(int nilai1, int nilai2){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }
    
    public int getPerkalian(){
        return nilai1 * nilai2;
    }
}
