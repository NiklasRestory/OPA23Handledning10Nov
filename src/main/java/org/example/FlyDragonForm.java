package org.example;

import javax.swing.*;

public class FlyDragonForm {
    private JPanel dragonFlyPanel;
    private JLabel dragonFlyMessageLabel;
    private JFrame jFrame = new JFrame("Flying!");

    public FlyDragonForm(Dragon dragon) {
        jFrame.setTitle("Flying on " + dragon.getName() + "!");
        jFrame.setContentPane(dragonFlyPanel);
        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        dragonFlyMessageLabel.setText("You went flying on " + dragon.getName() + "!");
    }
}
