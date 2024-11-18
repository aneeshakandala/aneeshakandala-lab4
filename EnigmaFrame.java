import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame extends JFrame {
    
    private JTextField startingChar; //to input starting character 
    
    private JComboBox<String> in;
    private JComboBox<String> mid;
    private JComboBox<String> outer;

    // JLabel inner = new JLabel("Inner");
    // JLabel middle = new JLabel("Middle");
    // JLabel out = new JLabel("Out");
    // JLabel initialpos = new JLabel("Initial Positions");
    // JLabel input = new JLabel("Input");
    // JLabel output = new JLabel("Output");

    JButton encrypt = new JButton ("Encrypt");
    JButton decrypt = new JButton ("Decrypt");

    private final int[] rotornums = {
        1, 2, 3, 4, 5
    };

    public EnigmaFrame(){
        //super();

        startingChar = new JTextField("EST");

        in = new JComboBox<String>(rotornums);
        mid = new JComboBox<String>(rotornums);
        outer = new JComboBox<String>(rotornums);
        toValue.setEditable(false);

        JPanel dpanel = new JPanel(new FlowLayout());
        dpanel.add(new JLabel("Inner"));

        dpanel.add(new JLabel("Middle"));
        dpanel.add(new JLabel("Out"));
        dpanel.add(new JLabel("Initial Positions"));
        dpanel.add(new JLabel("Input"));
        dpanel.add(new JLabel("Output"));


    }

    public static  void main(String args[]){
        EnigmaFrame e = new EnigmaFrame();
        e.setVisible(true);
    }
    

}

