package oefening1;

import javax.swing.*;

public class SecondenOmzetter {


    private JPanel SecondenOmzetter;
    private JTextField uren;
    private JTextField minuten;
    private JTextField seconden;
    private JTextField totaalseconden;
    private JButton zetOmButton;
    private JButton clearButton;



    public void run() {
        JFrame frame = new JFrame();
        frame.setTitle("Bereken product");
        frame.setSize(800, 400);
        frame.setContentPane(SecondenOmzetter);
        frame.setTitle("bereken");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
