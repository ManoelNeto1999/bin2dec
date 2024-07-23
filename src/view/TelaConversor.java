package view;

import service.Conversor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConversor extends JFrame {

    public TelaConversor(){
        super("Bin2Dec");
        setSize(520,680);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        addComponents();
    }

    private void addComponents() {
        JLabel bin2DecLabel = new JLabel("Bin2Dec");
        bin2DecLabel.setBounds(0,25,520,100);
        bin2DecLabel.setForeground(Color.WHITE);
        bin2DecLabel.setFont(new Font("Dialog", Font.BOLD, 40));
        bin2DecLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(bin2DecLabel);

        JLabel binarioLabel = new JLabel("Binário");
        binarioLabel.setBounds(30,150,400,25);
        binarioLabel.setForeground(Color.WHITE);
        binarioLabel.setFont(new Font("Dialog", Font.BOLD, 18));

        JTextField binarioField = new JTextField();
        binarioField.setBounds(30,185,450,55);
        binarioField.setFont(new Font("Dialog", Font.BOLD, 18));
        binarioField.setDocument(new JTextFieldLimit(8));

        add(binarioLabel);
        add(binarioField);

        JLabel decimalLabel = new JLabel("Decimal");
        decimalLabel.setBounds(30,310,400,25);
        decimalLabel.setForeground(Color.WHITE);
        decimalLabel.setFont(new Font("Dialog", Font.BOLD, 18));

        JTextField decimalField = new JTextField();
        decimalField.setBounds(30,345,450,55);
        decimalField.setFont(new Font("Dialog", Font.BOLD, 18));

        add(decimalLabel);
        add(decimalField);

        JButton converteButton = new JButton("Converter");
        converteButton.setFont(new Font("Dialog", Font.BOLD, 18));
        converteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        converteButton.setBounds(135,265,260,50);
        converteButton.setHorizontalAlignment(SwingConstants.CENTER);

        converteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String numero = binarioField.getText();

                if (numero.contains("2") || numero.contains("3") || numero.contains("4") || numero.contains("5") || numero.contains("6")
                        || numero.contains("7") || numero.contains("8") || numero.contains("9")) {
                        JOptionPane.showMessageDialog(TelaConversor.this, "Digite apenas 1 ou 0 !!!");
                        binarioField.setText("");
                        decimalField.setText("");
                }
                else {
                    Conversor conversor = new Conversor();
                    String valorConvertido = String.valueOf(conversor.converte(numero));
                    decimalField.setText(valorConvertido);
                }
            }
        });

        add(converteButton);

    }
}
