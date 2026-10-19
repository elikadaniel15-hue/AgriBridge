
package agribridge;

import java.awt.*;
import javax.swing.*;

public class AgriBridge {

    public static void main(String[] args) {
        System.out.println("Welcome to AgriBridge");

        // Open the login form
        SwingUtilities.invokeLater(() -> loginForm());
    }

    public static void loginForm() {

        JFrame Lframe = new JFrame("AgriBridge - Login Form");

        // Labels
        JLabel email = new JLabel("Email:");
        JLabel password1 = new JLabel("Password:");

        // Text fields
        JTextField emailT = new JTextField();
        JPasswordField passwordT = new JPasswordField();

        // Buttons
        JButton loginButton = new JButton("Login");
        JButton createButton = new JButton("Create Account");

        // Set positions and sizes
        email.setBounds(30, 30, 100, 30);
        emailT.setBounds(140, 30, 180, 30);

        password1.setBounds(30, 80, 100, 30);
        passwordT.setBounds(140, 80, 180, 30);

        loginButton.setBounds(40, 140, 120, 35);
        createButton.setBounds(170, 140, 150, 35);

        // Add components to the frame
        Lframe.add(email);
        Lframe.add(emailT);
        Lframe.add(password1);
        Lframe.add(passwordT);
        Lframe.add(loginButton);
        Lframe.add(createButton);

        // Login button action
        loginButton.addActionListener(e -> {
            String userEmail = emailT.getText();
            String userPassword = new String(passwordT.getPassword());

            if (userEmail.isEmpty() || userPassword.isEmpty()) {
                JOptionPane.showMessageDialog(
                    Lframe, "Please enter your email and password."
                );
            } else {
                JOptionPane.showMessageDialog(
                    Lframe, "Login form submitted successfully!"
                );
            }
        });

        // Create account button action
        createButton.addActionListener(e -> createAccountForm());

        // Configure the frame
        Lframe.setSize(370, 250);
        Lframe.setLayout(null);
        Lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lframe.setLocationRelativeTo(null);
        Lframe.setVisible(true);
    }

    public static void createAccountForm() {

        JFrame Cframe = new JFrame("AgriBridge - Create Account");

        // Labels
        JLabel nameLabel = new JLabel("Full Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");

        // Text fields
        JTextField nameT = new JTextField();
        JTextField emailT = new JTextField();
        JPasswordField passwordT = new JPasswordField();

        // Create account button
        JButton registerButton = new JButton("Register");

        // Set positions and sizes
        nameLabel.setBounds(30, 30, 100, 30);
        nameT.setBounds(140, 30, 180, 30);

        emailLabel.setBounds(30, 80, 100, 30);
        emailT.setBounds(140, 80, 180, 30);

        passwordLabel.setBounds(30, 130, 100, 30);
        passwordT.setBounds(140, 130, 180, 30);

        registerButton.setBounds(110, 180, 120, 35);

        // Add components to the frame
        Cframe.add(nameLabel);
        Cframe.add(nameT);
        Cframe.add(emailLabel);
        Cframe.add(emailT);
        Cframe.add(passwordLabel);
        Cframe.add(passwordT);
        Cframe.add(registerButton);

        // Register button action
        registerButton.addActionListener(e -> {
            if (nameT.getText().isEmpty()
                    || emailT.getText().isEmpty()
                    || passwordT.getPassword().length == 0) {

                JOptionPane.showMessageDialog(
                    Cframe, "Please fill in all fields."
                );

            } else {
                JOptionPane.showMessageDialog(
                    Cframe, "Account form submitted successfully!"
                );
            }
        });

        // Configure the frame
        Cframe.setSize(370, 280);
        Cframe.setLayout(null);
        Cframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Cframe.setLocationRelativeTo(null);
        Cframe.setVisible(true);
    }
}
