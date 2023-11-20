package SoloLearn;

import java.util.Scanner;
public class returns{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        System.out.println(fahr(c));
    }
    static double fahr(double c){
        return c*1.8+32;
    }
}