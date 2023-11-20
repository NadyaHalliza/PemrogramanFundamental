package SoloLearn;

import  java.util.Scanner;

public class decision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        if(temperature >= 100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }
    }
}