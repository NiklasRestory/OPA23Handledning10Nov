package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DragonCreatorForm {
    private JTextField ageField;
    private JTextField nameField;
    private JTextField wingspanField;
    private JTextField colorField;
    private JTextField gasLevelField;
    private JButton submitDragonButton;
    private JList dragonJList;
    private DefaultListModel dragonListModel = new DefaultListModel();
    private JButton removeDragonButton;

    private JPanel dragonCreatorPanel;

    ArrayList<Dragon> dragonList = new ArrayList<>();
    private JFrame jFrame = new JFrame("Dragon Creator");
    public DragonCreatorForm() {
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setContentPane(dragonCreatorPanel);
        jFrame.setVisible(true);

        dragonJList.setModel(dragonListModel);

        submitDragonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText();
                    int age = Integer.parseInt(ageField.getText());
                    int wingspan = Integer.parseInt(wingspanField.getText());
                    String color = colorField.getText();
                    int gasLevel = Integer.parseInt(gasLevelField.getText());

                    Dragon newDragon = new Dragon(name, age, wingspan, color, gasLevel);
                    dragonList.add(newDragon);
                    dragonListModel.addElement(newDragon.getName());
                }
                catch (Exception ex) {

                }
            }
        });
    }

}
