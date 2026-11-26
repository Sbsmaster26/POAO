package Ficha11.Ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

public class ConsultaHorarios extends JFrame {
    private JLabel numComboio, destino, horaPartida, plataforma, label1, label2, label3;
    private JTextField numero;
    private JButton consultarHorario, limpar;
    private JPanel panel1, panel2, panel3;
    private ArrayList<String[]> comboios = new ArrayList<>();
    
    private class ButtonConsultarHorario implements ActionListener{
        @Override 
        public void actionPerformed(ActionEvent e){
            String num = numero.getText();
        }
    }

    public ConsultaHorarios(){
        ArrayList<>String[] comboios = new ArrayList<>();
        File f = new File("src/Ficha11/Ex1/Comboios.txt");
        if (f.exists() && f.isFile()) {
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String[] array = line.split(";");
                    comboios.add(array);
                }
                br.close();
                fr.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Erro ao abrir ficheiro!");
                System.exit(1);
            } catch (IOException ex) {
                System.out.println("Erro ao ler ficheiro de texto!");
                System.exit(1);
            }
        } else {
            System.out.println("O ficheiro não existe!");
        }
        super();
        setTitle("Sistema de Consulta Ferroviária");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numComboio = new JLabel("Número do Comboio: ");
        numero = new JTextField(10);
        consultarHorario = new JButton("Consultar horário: ");

        destino = new JLabel("Destino: ");
        label2 = new JLabel("-");
        destino = new JLabel("Hora de partida: ");
        label1 = new JLabel("-");
        destino = new JLabel("Plataforma: ");
        label3 = new JLabel("-");
        result = new JLabel();
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(label1);
        panel.add(number1);
        panel.add(label2);
        panel.add(number2);
        panel.add(buttonSum);
        panel.add(result);
        buttonSum.addActionListener(new ButtonSumListener());
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConsultaHorarios();
    }
}
