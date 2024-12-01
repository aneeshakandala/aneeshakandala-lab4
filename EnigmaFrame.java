import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame extends JFrame {
    
    private JTextField startingChar; //to input starting character 
    
    private JComboBox<Integer> in;
    private JComboBox<Integer> mid;
    private JComboBox<Integer> outer;

    // JLabel inner = new JLabel("Inner");
    // JLabel middle = new JLabel("Middle");
    // JLabel out = new JLabel("Out");
    // JLabel initialpos = new JLabel("Initial Positions");
    // JLabel input = new JLabel("Input");
    // JLabel output = new JLabel("Output");

    private JButton encrypt;
    private JButton decrypt;

    private JTextArea inputText;
    private JTextArea outputText;

    private final Integer[] rotornums = {
        1, 2, 3, 4, 5
    };

    public EnigmaFrame(){
        //super();
        setTitle("Enigma GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,300);
        setLayout(new BorderLayout());

        startingChar = new JTextField(3);//("EST", 5)

        in = new JComboBox<Integer>(rotornums); 
        mid = new JComboBox<Integer>(rotornums);
        outer = new JComboBox<Integer>(rotornums);
        //toValue.setEditable(false);

        //three panels to make things look better

        JPanel upperPanel = new JPanel(new FlowLayout());
        upperPanel.add(new JLabel("Inner"));
        upperPanel.add(in);
        upperPanel.add(new JLabel("Middle"));
        upperPanel.add(mid);
        upperPanel.add(new JLabel("Out"));
        upperPanel.add(outer);
    
        upperPanel.add(new JLabel("Initial Positions"));
        upperPanel.add(startingChar);
       

        encrypt = new JButton ("Encrypt");//needs event listener
        decrypt = new JButton ("Decrypt");//needs event listener 
        upperPanel.add(encrypt);
        upperPanel.add(decrypt);

        JPanel middlePanel = new JPanel(new FlowLayout());
        middlePanel.add(new JLabel("Input"));
        inputText = new JTextArea(5,30);
        middlePanel.add(inputText);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(new JLabel("Output"));
        outputText = new JTextArea(5,30);
        bottomPanel.add(outputText);

        add(upperPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        encrypt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                String initialpos = startingChar.getText();
                int innerRotor = (int) in.getSelectedItem();
                int middleRotor = (int) mid.getSelectedItem();
                int outerRotor = (int) outer.getSelectedItem();

                Enigma enigma = new Enigma (innerRotor, middleRotor, outerRotor, initialpos);

                String encrypted = enigma.encrypt(input);
                outputText.setText(encrypted);
            }
        });

        decrypt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputText.getText();
                String initialpos = startingChar.getText();
                int innerRotor = (int) in.getSelectedItem();
                int middleRotor = (int) mid.getSelectedItem();
                int outerRotor = (int) outer.getSelectedItem();

                Enigma enigma = new Enigma (innerRotor, middleRotor, outerRotor, initialpos);

                String decrypted = enigma.decrypt(input);
                outputText.setText(decrypted);
            }
        });

    }
    

}

