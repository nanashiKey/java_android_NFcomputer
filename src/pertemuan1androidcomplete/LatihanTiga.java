/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1androidcomplete;

/**
 *
 * @author Irfan Assidiq
 * 0838 7466 5415
 * 
 */
public class LatihanTiga {
    public static void main(String[] args){
        String[] buahbuahan = new String[10];
        String[] sayuran = {"sawi",
                            "tomat",
                            "kangkung",
                            "lobak",
                            "wortel"};
        
        for (int a = 0; a < sayuran.length; a++ ){
            System.out.println("sayuran ke-"+a+
                        "adalah "+sayuran[a]);   
        }
        
        // menggunakan for
        for (int a = 0; a < 5; a++){
            for (int b = a; b<5; b++){
             System.out.print(" * ");
            }
            System.out.print("\n");
        }
        //menggunakan while
        int a = 0;
        while (a < 5){
            System.out.print(" * ");
            a++;
        }
        System.out.println("");
        
        // menggunakan do while
        int b = 0;
        do{
           System.out.print(" * ");
           b++;
        }while(b<5);
    }
}
