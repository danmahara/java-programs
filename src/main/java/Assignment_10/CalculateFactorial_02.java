package Assignment_10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Factorial {

    Factorial() {
        JFrame f = new JFrame("AWT Factorial ");
        f.setLayout(null); // Use a null layout

        // Create and position components using (x, y) coordinates
        JLabel l1 = new JLabel("Enter an positive integer:");
        l1.setBounds(50, 50, 150, 30); // (x, y, width, height)

        JTextField t1 = new JTextField(10);
        t1.setBounds(200, 50, 100, 25);

        JLabel l2 = new JLabel("Factorial:");
        l2.setBounds(50, 80, 150, 30);

        JTextField resultField = new JTextField(10);
        resultField.setEditable(false); // Make it read-only
    resultField.setBounds(200, 80, 100, 25);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(resultField);

        t1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(t1.getText());
                    long factorial = calculateFactorial(number);
                    resultField.setText(String.valueOf(factorial));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        f.setSize(400, 200);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}

public class CalculateFactorial_02 {

    public static void main(String[] args) {
        new Factorial();
    }
}
