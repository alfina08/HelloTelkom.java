/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFINA
 */
import static java.time.Clock.system;
import java.util.Scanner;
public class Kondisi {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.println("Alfina Hidayati / X RPL 6 / 06");
        System.out.print("Masukan nilai akhir PBO :");
        nilai = masukan.nextInt();
        if (nilai < 70)
            System.out.println("Siswa tidak lulus");
        if (nilai > 70)
            system.out.println("Siswa lulus");
        
                    
        
    }
    
}
