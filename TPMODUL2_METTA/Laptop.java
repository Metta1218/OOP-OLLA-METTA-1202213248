/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.modul.pkg2;

public class Laptop extends Perangkat {
    protected boolean webcam;
    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam=webcam;
    }
    public void informasi(String name, int ram, float processor, boolean webcam){
        if (webcam==true){
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz selain itu laptop ini "+webcam+ " memiliki webcam");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz selain itu laptop ini "+webcam+ " memiliki webcam");
        }
    }
    
    public void bukaGame (String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }
    public void kirimemail(String email){
        System.out.println("Laptop berhasil mengirim email ke "+email);
    }
    public void kirimemail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim email ke "+email1+" dan "+email2);
    }
    
}
