package org.example;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    private JButton flyDragonButton;

    private JPanel dragonCreatorPanel;

    ArrayList<Dragon> dragonList = new ArrayList<>();
    private JFrame jFrame = new JFrame("Dragon Creator");
    public DragonCreatorForm() {
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setContentPane(dragonCreatorPanel);
        jFrame.setVisible(true);

        dragonList.add(new Dragon("Default", 23, 40, "Red", 34));
        dragonList.add(new Dragon("Drednaught", 472, 30, "Black", 3499));
        dragonList.add(new Dragon("Zombie Dragon", 3453, 60, "Grey", 334));
        dragonList.add(new Dragon("Earth Dragon", 23000, 20, "Yellow", 394));

        dragonJList.setModel(dragonListModel);

        for (Dragon dragon: dragonList) {
            dragonListModel.addElement(dragon.getName());
        }

        submitDragonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText();
                    int age = Integer.parseInt(ageField.getText());
                    int wingspan = Integer.parseInt(wingspanField.getText());
                    String color = colorField.getText();
                    int gasLevel = Integer.parseInt(gasLevelField.getText());

                    nameField.setText("");
                    ageField.setText("");
                    wingspanField.setText("");
                    colorField.setText("");
                    gasLevelField.setText("");

                    int index = dragonJList.getSelectedIndex();
                    if (index >= 0) { // Index will be -1 if none is selected
                        // Update the dragon if one is chosen.
                        Dragon dragon = dragonList.get(index);
                        dragon.setName(name);
                        dragon.setAge(age);
                        dragon.setWingspan(wingspan);
                        dragon.setColor(color);
                        dragon.setGasLevel(gasLevel);
                    }
                    else {
                        Dragon newDragon = new Dragon(name, age, wingspan, color, gasLevel);
                        dragonList.add(newDragon);
                        dragonListModel.addElement(newDragon.getName());
                    }
                }
                catch (Exception ex) {

                }
                dragonJList.setSelectedIndex(-1);
            }
        });
        dragonJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = dragonJList.getSelectedIndex();
                if (index >= 0) {
                    Dragon dragon = dragonList.get(index);
                    nameField.setText(dragon.getName());
                    ageField.setText(dragon.getAge() + "");
                    wingspanField.setText(dragon.getWingspan() + "");
                    colorField.setText(dragon.getColor());
                    gasLevelField.setText(dragon.getGasLevel() + "");
                }
            }
        });
        flyDragonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = dragonJList.getSelectedIndex();
                if (index >= 0) {
                    Dragon dragon = dragonList.get(index);

                    FlyDragonForm flyDragonForm = new FlyDragonForm(dragon);
                }
            }
        });
    }

}
