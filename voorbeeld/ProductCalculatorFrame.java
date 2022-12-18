package voorbeeld;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductCalculatorFrame {
    private JPanel ProductCalculatorPanel;
    private JTextField textFieldGetal1;
    private JTextField textFieldGetal2;
    private JTextField textFieldResultaat;
    private JButton buttonBerekenProduct;


    public ProductCalculatorFrame() {
        buttonBerekenProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double getal1 = Double.parseDouble(textFieldGetal1.getText());
                double getal2 = Double.parseDouble(textFieldGetal2.getText());
                textFieldResultaat.setText((getal1*getal2)+"");
            }
        });
    }


    public void run() {
        JFrame frame = new JFrame();
        frame.setTitle("Bereken product");
        frame.setSize(800, 400);
        frame.setContentPane(ProductCalculatorPanel);
        frame.setTitle("bereken");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

