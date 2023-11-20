package Tugas3;

import java.util.Scanner;
class Mesinkopi{
    public static void main(String[] args){
        String[] menu = {"Cappucino", "Moccachino", "Caramel", "Black Coffee", "Espresso", "Arabica", "Luwak"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Silakan pilih Rasa : ");
        int rasa = sc.nextInt();
        if(rasa==0){
            System.out.println("Silakan Menikmati "+menu[0]+" Pesanan Anda");
        } else if(rasa==1){
            System.out.println("Silakan Menikmati "+menu[1]+" Pesanan Anda");
        } else if(rasa==2){
            System.out.println("Silakan Menikmati "+menu[2]+" Pesanan Anda");
        } else if(rasa==3){
            System.out.println("Silakan Menikmati "+menu[3]+" Pesanan Anda");
        } else if(rasa==4){
            System.out.println("Silakan Menikmati "+menu[4]+" Pesanan Anda");
        } else if(rasa==5){
            System.out.println("Silakan Menikmati "+menu[5]+" Pesanan Anda");
        } else if(rasa==6){
            System.out.println("Silakan Menikmati "+menu[6]+" Pesanan Anda");
        } else {
            System.out.println("Maaf, Menu Tidak Tersedia");
        }
    }
}
