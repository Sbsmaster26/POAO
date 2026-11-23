package Aleatorios;

import javax.swing.*;
import java.awt.*;

public class PanelGrid {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Painel GridLayout");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel("Valor 1");
        JTextField text1 = new JTextField(10);
        JLabel label2 = new JLabel("Valor 2");
        JTextField text2 = new JTextField(10);
        JLabel label3 = new JLabel("Valor 3");
        JTextField text3 = new JTextField(10);
        JButton button = new JButton("Calcular");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(label3);
        panel.add(text3);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
