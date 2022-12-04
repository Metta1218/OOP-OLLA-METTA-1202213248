/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.modul.pkg2;

public class Handphone extends Perangkat {
    protected boolean fingerprint;
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint=fingerprint;
    }
    public void informasi(String drive, int ram, float processor, boolean fingerprint){
        if (fingerprint==true){
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz selain itu handphone ini  memiliki fingerprint");
        }
        else{
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz selain itu handphone ini tidak memiliki fingerprint");
        }
    }
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke "+no_hp);
    }
    
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No  "+no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp1+" dan No "+no_hp2);
    }
}
