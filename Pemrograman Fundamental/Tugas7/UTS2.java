package Tugas7;

import java.util.Scanner;
class UTS2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int jumlah = sc.nextInt();
        int[] num = new int[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.print("Data ke-"+(0+i)+" : ");
            num[i] = sc.nextInt();
        }
        System.out.println("Menampilkan Data");
        int summary = 0;
        for(int i = 0; i < jumlah; i++){
            System.out.print(num[i]+"-> ");

            if (num[i] % 2 == 0){
                System.out.println("GENAP");
            } else {
                System.out.println("GANJIL");
            }
        }
        sc.close();
        for(int i = 0; i < num.length; i++){
            summary+= num[i];
        }
        System.out.println("TOTAL PENJUMLAHAN = "+summary);
        double mean = summary/num.length;
        System.out.println("RATA-RATA = "+mean);

    }
}
