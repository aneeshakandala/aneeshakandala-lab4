import javax.swing.*;
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

    JButton encrypt;
    JButton decrypt;

    private final Integer[] rotornums = {
        1, 2, 3, 4, 5
    };

    public EnigmaFrame(){
        //super();
        setTitle("Enigma GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLayout(new BorderLayout());

        startingChar = new JTextField("EST", 5);

        in = new JComboBox<Integer>(rotornums); 
        mid = new JComboBox<Integer>(rotornums);
        outer = new JComboBox<Integer>(rotornums);
        //toValue.setEditable(false);

        encrypt = new JButton ("Encrypt");
        decrypt = new JButton ("Decrypt");

        JPanel dpanel = new JPanel(new FlowLayout());
        dpanel.add(new JLabel("Inner"));
        dpanel.add(in);
        dpanel.add(new JLabel("Middle"));
        dpanel.add(mid);
        dpanel.add(new JLabel("Out"));
        dpanel.add(outer);
        dpanel.add(new JLabel("Initial Positions"));
        dpanel.add(startingChar);
        dpanel.add(new JLabel("Input"));
        dpanel.add(new JLabel("Output"));


    }

    public static  void main(String args[]){
        EnigmaFrame e = new EnigmaFrame();
        e.setVisible(true);
    }
    

}

