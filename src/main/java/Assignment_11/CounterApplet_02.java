
package Assignment_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApplet_02 extends JApplet {
    private int count = 0;
    private JLabel countLabel;

    public void init() {
        // Create and set up the Swing components
        countLabel = new JLabel("Count: " + count);
        JButton incrementButton = new JButton("Increment");
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                updateCountLabel();
            }
        });

        // Add components to the applet's content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(countLabel);
        contentPane.add(incrementButton);
    }

    private void updateCountLabel() {
        countLabel.setText("Count: " + count);
    }
}
