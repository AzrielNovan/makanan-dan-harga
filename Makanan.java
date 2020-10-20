/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makanan;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Makanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array
    String[] makanan = {"Nasi Goreng", "Odading Mang Oleh", "Lalapan with rice white", "Soto Daging", "Ayam goreng Mail"};
    int[] harga = {12000, 2000, 30000, 20000, 7500};
            
    System.out.println("Selamat Datang");
    System.out.println("Daftar Makanan");
    
    //perulangan
   for(int i = 0; i < harga.length; i++){
       System.out.println(i+". "+makanan[i]+" => "+harga[i]);
    }
    //scanner
    System.out.println("Silahkan memilih makanan anda");
    
    Scanner input = new Scanner(System.in);
    
    int pilihan = input.nextInt();
    
    System.out.println("input pilihan: "+makanan[pilihan]);
    
    //percabangan
    System.out.println("Silahkan masukkan uang anda");
    
    int uang = input.nextInt();
    
    if (uang > harga[pilihan]){
        System.out.println("kembalian "+(uang - harga[pilihan]));
    }else if (uang == harga[pilihan]){
        System.out.println("Uang Anda pas, Silahkan menikmati hidangan ");
    }else{
        System.out.println("Uang anda kurang"+(harga[pilihan]-uang));
    }
    
    }
    
}
