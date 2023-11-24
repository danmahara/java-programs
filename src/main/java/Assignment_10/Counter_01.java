package Assignment_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

class CounterDemo {

    CounterDemo() {
        JFrame f = new JFrame("AWT Counter");
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Enter an integer");
        f.add(l1);
        JTextField t1 = new JTextField("", 10);
        f.add(t1);

        JButton b = new JButton("Count Down");
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(t1.getText());
                if (num < 1) {
                    t1.setText(" Can't go below");
                } else {
                    num--;

                    t1.setText("" + num);
                }

            }
        }
        );

        f.setSize(400, 400);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

public class Counter_01 {

    public static void main(String[] args) {
        new CounterDemo();
    }
}
