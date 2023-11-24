
package Assignment_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Accumulated {

    public Accumulated() {
        JFrame f = new JFrame("AWT Accumulator ");
        f.setLayout(null); // Use a null layout

        // Create and position components using (x, y) coordinates
        JLabel l1 = new JLabel("Enter an positive integer:");
        l1.setBounds(50, 50, 150, 30); // (x, y, width, height)

        JTextField t1 = new JTextField(10);
        t1.setBounds(200, 50, 100, 25);

        JLabel l2 = new JLabel("Accumulated sum is ");
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
                int num=Integer.parseInt(t1.getText());
                int accumulated =accumulatedSum(num);
             resultField.setText(String.valueOf(accumulated));
            }
        });

        f.setSize(400, 300);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
    private static int accumulatedSum(int n){
      if (n < 0) {
        throw new IllegalArgumentException("Error: Input must be a positive integer.");
    }
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
    }
}

public class AccumulatedSum_03 {

    public static void main(String[] args) {
        new Accumulated();

    }
}
