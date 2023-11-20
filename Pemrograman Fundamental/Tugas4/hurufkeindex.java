package Tugas4;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class hurufkeindex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        out.print("Input Nilai Huruf : ");
        String nilaihuruf = sc.next();
        double nilaiindex;

        if (nilaihuruf.equals("A")){
            nilaiindex = 4.0;
        }else if (nilaihuruf.equals("B")){
            nilaiindex = 3.0;
        }else if (nilaihuruf.equals("C")){
            nilaiindex = 2.0;
        }else if (nilaihuruf.equals("D")){
            nilaiindex = 1.0;
        }else if (nilaihuruf.equals("E")){
            nilaiindex = 0.0;
        }else{
            System.out.println("Konversi nilai tidak valid.");
            return;
        }
        System.out.println("Nilai Index = "+nilaiindex);
    }
}
