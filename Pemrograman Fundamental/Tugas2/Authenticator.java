package Tugas2;

import static java.lang.System.out;
import java.util.Scanner;

public class Authenticator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Username: ");
        String username = keyboard.next();

        if(username.equals("nacha")){
            System.out.print("Password :");
            String password = keyboard.next();

            if(password.equals("justwannalogin")){
                System.out.println("You're in.");
            }else{
                out.println("Incorrect password");
            }
        }else{
            out.println("Unknown user");
        }

        keyboard.close();
    }
}