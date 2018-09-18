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
public class Beasiswa {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Alfina Hidayati / X RPL 6 / 06");
        System.out.print("Masukan nilai TPA:");
        int TPA = masukan.nextInt();
        System.out.print("Masukan nilai Bahasa Inggris:");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.println("Siswa dapat Beasiswa");
        else
            System.out.println("Siswa tidak dapat Beasiswa");
        
    }
    
}
