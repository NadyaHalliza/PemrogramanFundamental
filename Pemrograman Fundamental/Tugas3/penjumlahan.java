package Tugas3;

import java.util.Scanner;
public class penjumlahan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input angka = ");
        double no1 = sc.nextDouble();
        System.out.println("input angka = ");
        double no2 = sc.nextDouble();
        double sum = no1 + no2;
        System.out.println("Jumlah = "+sum);
        sc.close();
    }
}
