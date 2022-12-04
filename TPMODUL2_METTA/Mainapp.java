/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.modul.pkg2;



public class Mainapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Perangkat perangkat=new Perangkat("Adata",2,(float)1.90);
        perangkat.informasi("Adata",2,(float)1.90);
        
        Laptop laptop=new Laptop("Seagate", 8, (float)2.40, true);
        laptop.informasi("Seagate", 8, (float)2.40,true);
        laptop.bukaGame("Genshin Impact");
        laptop.kirimemail("TPmodul2@gmail.com");
        laptop.kirimemail("tuhanbersama@gmail.com", "mahasiswasem3@gmail.com");
        
        Handphone hp=new Handphone("Sandisk", 3, (float)2.20, true);
        hp.informasi("Sandisk", 3, (float)2.20, true);
        hp.telfon(62568459);
        hp.kirimSMS(628648957);
        hp.kirimSMS(628569869, 628756946);
        
        
        
       
    }
    
}
