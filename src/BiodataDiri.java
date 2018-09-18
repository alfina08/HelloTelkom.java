/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFINA
 */
import java.util.Scanner;
public class BiodataDiri {
    public static void main(String[] args) {
       String Nama,Nis,TempatLahir,TanggalLahir,JenisKelamin,AlamatDiMalang,MottoHidup;
            Scanner biodata = new Scanner (System.in);
             
            System.out.println("Alfina Hidayati / X RPL 6 / 06");
            System.out.println("Masukkan data data anda");
            System.out.print("Nama: ");
            Nama=biodata.nextLine();

            System.out.print("Nis: ");
            Nis=biodata.nextLine();

            System.out.print("Tempat Lahir: ");
            TempatLahir = biodata.nextLine();

            System.out.print("Tanggal Lahir: ");
            TanggalLahir = biodata.nextLine();

            System.out.print("Jenis Kelamin: ");
            JenisKelamin = biodata.nextLine();
           
            System.out.print("Alamat: ");
            AlamatDiMalang = biodata.nextLine();
                        
            System.out.println("============================");
            System.out.println("          Biodataku");
            System.out.println("============================");
          
}
}
