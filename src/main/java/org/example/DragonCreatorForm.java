package org.example;

import javax.swing.*;

public class DragonCreatorForm {
    private JTextField ageField;
    private JTextField nameField;
    private JTextField wingspanField;
    private JTextField colorField;
    private JTextField gasLevelField;
    private JButton submitDragonButton;
    private JList dragonList;
    private JButton removeDragonButton;

    private JPanel dragonCreatorPanel;
    private JFrame jFrame = new JFrame("Dragon Creator");
    public DragonCreatorForm() {
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setContentPane(dragonCreatorPanel);
        jFrame.setVisible(true);


    }

}
