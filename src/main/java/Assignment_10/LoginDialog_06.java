package Assignment_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginDialog_06 extends JFrame {

    private JLabel loginLabel, passwordLabel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public LoginDialog_06() {
        setTitle("Login Form");
        setSize(350, 200);

        setLayout(null); // Use null layout

        loginLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        loginField = new JTextField();
        passwordField = new JPasswordField();// to hide password
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");

        // Set bounds for each component
        loginLabel.setBounds(50, 20, 80, 25);
        loginField.setBounds(130, 20, 160, 25);
        passwordLabel.setBounds(50, 50, 80, 25);
        passwordField.setBounds(130, 50, 160, 25);
        loginButton.setBounds(70, 90, 80, 25);
        cancelButton.setBounds(170, 90, 80, 25);

        add(loginLabel);
        add(loginField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(cancelButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login button click here
                String username = loginField.getText();
                String password = new String(passwordField.getPassword());
                // Add your login logic here
                if (username.equals("danmahara") && password.equals("danmahara1")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    // Clear the input fields after successful login
                    loginField.setText("");
                    passwordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed. Please try again.");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle cancel button click here
                System.exit(0); // Close the application
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginDialog_06();
            }
        });

    }
}
