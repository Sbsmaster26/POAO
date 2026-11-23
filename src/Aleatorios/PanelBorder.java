package Aleatorios;

import javax.swing.*;
import java.awt.*;

public class PanelBorder {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Painel BorderLayout");
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Valor");
        JTextField text = new JTextField(10);
        JButton button = new JButton("Calcular");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        panel.add(text, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
    }
}
