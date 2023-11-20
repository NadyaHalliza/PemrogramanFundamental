package Tugas4;

import static java.lang.System.out;
import  java.util.Scanner;

public class angkatohuruf {
    public static void main(String[]afd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai = ");
        double nilai = sc.nextDouble();

        if(nilai>=0 && nilai <=100){
        } if(nilai>=80 && nilai<100) {
            System.out.println("Nilai Huruf = A");
        }else if(nilai>=70 && nilai<=79.99) {
            System.out.println("Nilai Huruf = B");
        }else if(nilai>=60 && nilai<=69.99) {
            System.out.println("Nilai Huruf = C");
        }else if(nilai>=50 && nilai<=59.99) {
            System.out.println("Nilai Huruf = D");
        }else if(nilai>=0 && nilai<=49.99) {
            System.out.println("Nilai Huruf = E");
        }else{
            System.out.println("Input nilai tidak valid");
        }
    }
}
