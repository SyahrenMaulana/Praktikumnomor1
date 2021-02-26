/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujibus;

/**
 *
 * @author Syahren Maulana
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek Busbesar dari kelas bus
        Bus busBesar = new Bus(5);
        busBesar.getPenumpang(17);
        busBesar.getPenumpang(24);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(2); //menambahkan 2 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(1); //menambahkan 1 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(2); //menambahkan 2 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(2); //menambahkan 2 penumpang
        busBesar.getAverage(195); //menambahkan beratbadan
        busBesar.cetak();
        
    }
    
}
