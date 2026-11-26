package Aleatorios;

import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;


public class List extends JFrame {
    JList list;
    JLabel labelSelectedValue;

    public List() {
        super();
        setTitle("JList");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Lista de valores (selecionar 1 ou mais valores)");
        label.setBounds(50, 10, 300, 25);
        DefaultListModel<String> listValues = new DefaultListModel();
        listValues.addElement("Daniel");
        listValues.addElement("Candeeiro");
        listValues.addElement("Cinturão");
        listValues.addElement("Item 4");
        listValues.addElement("Item 5");
        listValues.addElement("Item 6");
        listValues.addElement("Item 7");
        listValues.addElement("Item 8");
        listValues.addElement("Item 9");
        listValues.addElement("Item 10");
        listValues.addElement("Item 11");
        listValues.addElement("Item 12");
        list = new JList(listValues);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setBounds(50, 35, 300, 150);

        JButton btnSelected = new JButton("Selecionado ");
        ButtonListener btnActionListener = new ButtonListener();
        btnSelected.addActionListener(btnActionListener);
        btnSelected.setBounds(50, 200, 120, 25);
        labelSelectedValue = new JLabel("-");
        labelSelectedValue.setBounds(180, 200, 170, 25);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(listScroller);
        panel.add(btnSelected);
        panel.add(labelSelectedValue);
        add(panel);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(list.getSelectedValue());
            labelSelectedValue.setText(String.join(";", list.getSelectedValuesList()));
        }
    }
    public static void main(String[] args){
        new List();
    }
}