
package Assignment_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Currency {

    public Currency() {
        JFrame f = new JFrame("Currency Converter ");
        f.setLayout(null); // Use a null layout

        // Create and position components using (x, y) coordinates
        JLabel dollar = new JLabel("Dollar");
        dollar.setBounds(50, 50, 150, 30); // (x, y, width, height)

        JTextField dollarT1 = new JTextField(10);
        dollarT1.setBounds(200, 50, 100, 25);

        JLabel nepalese = new JLabel("Nepalese ");
        nepalese.setBounds(50, 80, 150, 30);

        JTextField nepaleseT2 = new JTextField(10);
//        nepaleseT2.setEditable(false); // Make it read-only
        nepaleseT2.setBounds(200, 80, 100, 25);

        JLabel euro = new JLabel("Euro");
        euro.setBounds(50, 110, 150, 30);

        JTextField euroT3 = new JTextField(10);
        euroT3.setBounds(200, 110, 100, 25);

        f.add(dollar);
        f.add(dollarT1);
        f.add(nepalese);
        f.add(nepaleseT2);
        f.add(euro);
        f.add(euroT3);

        dollarT1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float money = Integer.parseInt(dollarT1.getText());
                float nepalese = money * 132;
                float euro = (float) (money * 0.95);
                nepaleseT2.setText(String.valueOf(nepalese));
                euroT3.setText(String.valueOf(euro));
            }
        });

//        nepaleseT2.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                float money = Integer.parseInt(nepaleseT2.getText());
//                float dollar = money / 132;
//                float euro = (float) (money * 0.0071);
//                dollarT1.setText(String.valueOf(dollar));
//                euroT3.setText(String.valueOf(euro));
//            }
//        });
//        euroT3.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                float money = Integer.parseInt(euroT3.getText());
//                float nepalese = (float) (money /0.0071);
//                float dollar = (float) (money / 0.95);
//                dollarT1.setText(String.valueOf(dollar));
//                nepaleseT2.setText(String.valueOf(nepalese));
//            }
//        });

        f.setSize(400, 300);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}

public class CurrencyConverter_05 {

    public static void main(String[] args) {
        new Currency();

    }
}
