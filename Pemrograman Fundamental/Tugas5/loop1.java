package Tugas5;

import java.util.Scanner;
class loop1{

    public static void main(String[] xixi){
        Scanner sc = new Scanner(System.in);
        System.out.println("Set Timer = ");
        int x = sc.nextInt();
        System.out.println("Timer = "+x+" sec");

        for (x = x; x >= 0; x--){
            System.out.println(x);
        }
    }
}
