package Assignment_10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class RecordInfo {

    RecordInfo() {
        JFrame f = new JFrame("Information Record");
        f.setLayout(new FlowLayout()); // Use a FlowLayout

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5, 1)); // Left column with 5 rows

        // Create and position components in the left column
        JLabel fNameLabel = new JLabel("FirstName");
        JTextField fnField = new JTextField(10);
        JLabel lNameLabel = new JLabel("lastName");
        JTextField lnField = new JTextField(10);
        JLabel addressLabel = new JLabel("Address");
        JTextField addField = new JTextField(10);
        JLabel gender = new JLabel("Gender");

        // Create a panel for gender radio buttons
        JPanel genderPanel = new JPanel();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(male);
        genderButtonGroup.add(female);
        genderButtonGroup.add(other);

        JLabel countryLabel = new JLabel("Country");
        String[] countryList = { "Nepal", "Australia", "India", "China",
                "America" };
        JComboBox comboBox = new JComboBox<>(countryList);

        // Add components to the left panel
        leftPanel.add(fNameLabel);
        leftPanel.add(fnField);
        leftPanel.add(lNameLabel);
        leftPanel.add(lnField);
        leftPanel.add(addressLabel);
        leftPanel.add(addField);
        leftPanel.add(gender);
        leftPanel.add(genderPanel);
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);
        leftPanel.add(countryLabel);
        leftPanel.add(comboBox);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridBagLayout());
        // Create buttons and add to the right panel
        JButton addButton = new JButton("Add");
        JButton cancelButton = new JButton("Cancel");
        JButton resetButton = new JButton("Reset");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 0); // Add 10 pixels of spacing below each button

        // JButton showDataButton = new JButton("Show Saved Data");
        // rightPanel.add(showDataButton, gbc);
        ////
        rightPanel.add(addButton, gbc);
        rightPanel.add(cancelButton, gbc);
        rightPanel.add(resetButton, gbc);

        // Add left and right panels to the main frame
        f.add(leftPanel);
        f.add(rightPanel);

        // Add left and right panels to the main frame
        f.setSize(450, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        addButton.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String selectedGender = "";

                    String selectedCountry = (String) comboBox.getSelectedItem();
                    String fname = fnField.getText().trim();
                    String lname = lnField.getText().trim();
                    String address = addField.getText();

                    if (fname.isEmpty() && lname.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "First name and last name is required");
                        return;
                    } else if (lname.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Last name is required");
                        return;
                    } else if (fname.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "First name is required");
                        return;
                    }

                    if (male.isSelected()) {
                        selectedGender = "Male";
                    } else if (female.isSelected()) {
                        selectedGender = "Female";
                    } else if (other.isSelected()) {
                        selectedGender = "Other";
                    } else {
                        selectedGender = "";
                    }
                    System.out.println("\nFirst Name " + fname);
                    System.out.println("Last name " + lname);
                    System.out.println("Gender is " + selectedGender);
                    System.out.println("country " + selectedCountry);

                    FileOutputStream fos = new FileOutputStream(fname + ".txt");
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    BufferedWriter writer = new BufferedWriter(osw);
                    writer.write("First name : " + fname);
                    writer.write("\nLast name : " + lname);
                    writer.write("\nAddress : " + address);
                    writer.write("\nGender : " + selectedGender);
                    writer.write("\nCountry: " + selectedCountry);

                    writer.close();
                    osw.close();
                    fos.close();
                    JOptionPane.showMessageDialog(null, "Data saved successfully");

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                fnField.setText("");
                lnField.setText("");
                addField.setText("");
                genderButtonGroup.clearSelection();
            }

        });
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                System.exit(0);

            }

        });
        // Add an action listener to the "Show Saved Data" button
        // showDataButton.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent ae) {
        // try {
        // // Read data from the file
        // FileInputStream fis = new FileInputStream("userdata.txt");
        // InputStreamReader isr = new InputStreamReader(fis);
        // BufferedReader reader = new BufferedReader(isr);
        //
        // StringBuilder data = new StringBuilder();
        // String line;
        // while ((line = reader.readLine()) != null) {
        // data.append(line).append("\n");
        // }
        //
        // reader.close();
        // isr.close();
        // fis.close();
        //
        // // Display the saved data in a dialog box
        // JOptionPane.showMessageDialog(null, "Saved Data:\n" + data.toString());
        //
        // } catch (Exception e) {
        // System.out.println("Error: " + e.getMessage());
        // }
        // }
        // });

    }

}

public class RecordInformation_07 {

    public static void main(String[] args) {
        new RecordInfo();
    }
}
