/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1androidcomplete;

/**
 *
 * @author Irfan Assidiq
 */
public class LatihanDua {
    public static void main(String[] args){
        Model manusia = new Model();
        Model manusia2 = new Model();
        Model manusia3 = new Model();
        
        manusia.setNama("irfan");
        manusia.setAlamat("Depok");
        manusia.setUsia(12);
        
        manusia2.setNama("Dina");
        manusia2.setAlamat("Cianjur");
        manusia2.setUsia(20);
        
        manusia3.setData("Irfan", "Cianjur", 25);
        manusia3.setAngka(100, 2);
        System.out.println(
                manusia.getData()
                +"\n\n"+
                manusia2.getData()
                +"\n\n"+
                manusia3.getData()
                +"\n\n"+
                manusia3.getPerkalian()
        );
    }
   
}


