package Aleatorios;

import javax.swing.*;

public class Janela {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("A minha primeira janela");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Valor");
        JTextField text = new JTextField(10);
        JButton button = new JButton("Calcular");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(text);
        panel.add(button);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
