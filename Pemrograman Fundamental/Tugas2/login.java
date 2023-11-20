package Tugas2;

import javax.swing.JOptionPane;
public class login {
    public static void main(String[] args){
        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");
        if (username != null && password != null
                && (
                (username.equals("Nacha") && password.equals("justwannalogin")) ||
                        (username.equals("Salsa") && password.equals("pinkypie"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "hello sweetie");
        }else{
            JOptionPane.showMessageDialog(null, "who are you?");
        }
    }
}