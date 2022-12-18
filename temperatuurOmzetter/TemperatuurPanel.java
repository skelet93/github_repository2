package temperatuurOmzetter;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatuurPanel {
    private JPanel panelTemperatuur;
    private JTextField textFieldCelsius;
    private JButton zetOmNaarFahrenheitButton;
    private JTextField textFieldFahrenheit;
    private JButton zetOmNaarCelsiusButton;
    private JButton clearButton;

    public TemperatuurPanel() {
        zetOmNaarFahrenheitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        zetOmNaarCelsiusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    //deze run methode geeft de aangemaakte JFrame terug, zodat de oproeper daar nog iets mee kan doen als hij wil
    public JFrame run() {
        JFrame frame = new JFrame();
        frame.setContentPane(panelTemperatuur);
        frame.setTitle("temperatuur omzetter");
        frame.pack();
        //EXIT_ON_CLOSE wil zeggen dat het ganse programma gestopt wordt
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

}


