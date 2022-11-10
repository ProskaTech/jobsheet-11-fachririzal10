/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6_encapsulation;

/**
 *
 * @author Fachri
 */
public class UjiBus2 {
    public static void main(String[] args) {
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}
