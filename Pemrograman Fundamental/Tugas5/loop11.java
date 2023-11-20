package Tugas5;

import java.util.Scanner;
class loop11{
    public static void main(String[] xixi){
        Scanner sc = new Scanner(System.in);
        System.out.println("Set Timer = ");
        int x = sc.nextInt();
        System.out.println("Timer = "+x+" sec");
        do {
            System.out.println(x);
            x--;
        } while (x>=0);
    }
}
