package swingdemo;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingDemo extends JFrame implements ActionListener {

    private JLabel l1, l2, l3;
    private JTextField t1;
    private JComboBox<String> c1;
    private String[] str = {"2016", "2017", "2018"};
    private JRadioButton r1, r2, r3;
    
    public SwingDemo() {
        this.setSize(700, 500);
        l1 = new JLabel("League Name: ");
        t1 = new JTextField(20);
        l2 = new JLabel("League Year: ");
        c1 = new JComboBox<String>(str);
        l3 = new JLabel("Season: ");
        r1 = new JRadioButton("Summer");
        r2 = new JRadioButton("Winter");
        r3 = new JRadioButton("Autumn");
        this.setLayout(new FlowLayout());
        this.add(l1);
        this.add(t1);
        this.add(l2);
        this.add(c1);
        this.add(l3);
        this.add(r1);
        this.add(r2);
        this.add(r3);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new SwingDemo();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(this,"you have chosen");
    }
     
    }




