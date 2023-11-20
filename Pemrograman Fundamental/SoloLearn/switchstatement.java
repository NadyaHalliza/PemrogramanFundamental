package SoloLearn;

import  java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        //Declare a String scanner
        Scanner color = new Scanner(System.in);
        String boxColor = color.nextLine();
        //Use a double quotes for the case.
        switch (boxColor) {
            case "red":
                System.out.println(1);
                break;
            case "green":
                System.out.println(2);
                break;
            case "black":
                System.out.println(3);
                break;
        }
    }
}