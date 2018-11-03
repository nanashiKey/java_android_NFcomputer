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
public class LatOverloadingMethod {
    String nama;
    String sample;
    
    public void setSomething(String nama){
        this.nama = nama;
    }
    
    public void setSomething(String nama, String sample){
        this.nama = nama;
        this.sample = sample;
    }
}
