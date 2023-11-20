package SoloLearn;

import  java.util.Scanner;

public class multicondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=11) {
            System.out.println("Child");
        } else if(age<=17){
            System.out.println("Teen");
        } else if(age<=64){
            System.out.println("Adult");
        }
    }

}