
import java.util.Scanner;

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

public class KonversiSuhu {

    static double celcius;
    static double reamur;
    static double fahrenheit;
    static double kelvin;

    static void hitung(int a, double b) {

        if (a == 1) {
            reamur = (double) 4 / 5 * b;
            fahrenheit = (double) 9 / 5 * b + 32;
            kelvin = (double) b + 273.15;
        } else if (a == 2) {
            celcius = (double) 5 / 4 * b;
            fahrenheit = (double) 9 / 4 * b + 32;
            kelvin = (double) 4 / 5 * b + 273.15;
        } else if (a == 3) {
            celcius = (double) (b - 32) / 9 / 5;
            reamur = (double) (b - 32) / 9 / 4;
            kelvin = (double) (b + 459.67) / 9 / 5;
        } else if (a == 4) {
            celcius = (double) b - 273.15;
            reamur = (double) (b - 273.15) * 4 / 5;
            fahrenheit = (double) b * 9 / 5 - 459.67;
        }
    }

    public static void main(String[] args) {

        int pilih;
        int suhu;
        double input;

        Scanner in = new Scanner(System.in);

        System.out.println("Alfina Hidayati / X RPL 6 / 06");
        System.out.println("1 -> Celcius");
        System.out.println("2 -> Reamur");
        System.out.println("3 -> Fahrenheit");
        System.out.println("4 -> Kelvin");
        System.out.println("------------------");
        System.out.print("Pilih jenis suhu: ");

        pilih = in.nextInt();

        int pilihan = pilih;

        switch (pilihan) {
            case 1: {
                suhu = 1;
                System.out.print("Masukkan suhu= ");
                input = in.nextInt();
                System.out.println("");
                System.out.println(input + " Celcius dikonversikan menjadi");
                hitung(suhu, input);
                System.out.println("Reamur= " + reamur);
                System.out.println("Fahrenheit= " + fahrenheit);
                System.out.println("Kelvin= " + kelvin);
                break;
            }
            case 2: {
                suhu = 2;
                System.out.print("Masukkan suhu= ");
                input = in.nextInt();
                System.out.println("");
                System.out.println(input + " Reamur dikonversikan menjadi");
                hitung(suhu, input);
                System.out.println("Celcius= " + celcius);
                System.out.println("Fahrenheit= " + fahrenheit);
                System.out.println("Kelvin= " + kelvin);
                break;
            }
            case 3: {
                suhu = 3;
                System.out.print("Masukkan suhu= ");
                input = in.nextInt();
                System.out.println("");
                System.out.println(input + " Fahrenheit dikonversikan menjadi");
                hitung(suhu, input);
                System.out.println("Celcius= " + celcius);
                System.out.println("Reamur= " + reamur);
                System.out.println("Kelvin= " + kelvin);
                break;
            }
            case 4: {
                suhu = 4;
                System.out.print("Masukkan suhu= ");
                input = in.nextInt();
                System.out.println("");
                System.out.println(input + " Kelvin dikonversikan menjadi");
                hitung(suhu, input);
                System.out.println("Celcius= " + celcius);
                System.out.println("Reamur= " + reamur);
                System.out.println("Fahrenheit= " + fahrenheit);
                break;
            }
            default: {
                System.out.println("Pilihan yang anda masukkan tidak tersedia");
                break;
            }
        }

    }

}
