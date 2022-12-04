/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.modul.pkg2;

public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;
    
    public Perangkat(String drive, int ram, float processor){
        this.drive=drive;
        this.ram=ram;
        this.processor=processor; 
    }
    public void informasi(String drive, int ram, float processor){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+" Ghz");
    }
}
