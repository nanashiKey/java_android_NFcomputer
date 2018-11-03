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
public class LatihanInheritance2 extends LatihanInheritance {
    public void setNama(String nama){
        this.nama = nama;
    }
    //overriding method
    @Override
    public void setData(String data){
        this.data = data;
    }
}
