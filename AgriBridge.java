package agribridge;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class AgriBridge {
public static void main(String[] args){
System.out .println("Welcome to AgriBridge");
Joptionpane.showMessageDialog(null, "Hello user");
JFrame Lframe= new JFrame("Login Form");
  Lframe.setSize(300,300);
  Lframe.setLayout(null);
//labels and text fields
JLabel email= new Jlabel("Email :");
JLabel password1= new Jlabel("Password :");
JTextField emailT =new JTextField();
JPassword passwordT= new JPassword();
//JPassword password1= new Password("Password");
  email.setBound(30,30,100,30);
  password1.setBound(30,60,100,30);
  
// adding elements to the frame
  
Lframe.add(LogLabel);
  Lframe.setVisible(true);
}  
}
