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
public class Bus {
    public int penumpang;
    public int maxpenumpang;
    public int jumberatbadan;
    public int ratarata;
            
    //konstruktor kelas bus
    public Bus(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
        
    }
    public void getPenumpang(int password){
        if(password == 24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    public void getAverage(int jumberatbadan){
        this.jumberatbadan = jumberatbadan;
        ratarata = jumberatbadan / penumpang;
     }
        
    
    
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang Adalah : "+penumpang);
        System.out.println("Penumpang Maksimum Seharusnya Adalah :"+maxpenumpang);
        System.out.println("Berat Badan Rata-Rata :"+ratarata);
    }
}
