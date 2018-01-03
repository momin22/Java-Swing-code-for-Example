
package student;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentM extends JFrame implements  ActionListener{
    private  JLabel l1,l2,l3,l4,l5;
    private JTextField t1,t2,t3,t4,t5;
    private JButton b;
     public StudentM(){ 
         this.setSize(700,800);
         l1= new JLabel("Enter your Name:");
         l2= new JLabel("Enter your ID:");
         l3=new JLabel("Enter Your Email:");
         l4=new JLabel("Enter your Dept:");
         l5= new JLabel("Course:");
         t1=new JTextField(20);
         t2= new JTextField(20);
         t3= new JTextField(20);
         t4=new JTextField(20);
         t5=new JTextField(20);
         b=new JButton("Submit");
         this.setLayout(new FlowLayout());
         this.add(l1);
         this.add(t1);
         this.add(l2);
         this.add(t2);
           this.add(l3);
         this.add(t3);
         this.add(l4);
         this.add(t4);
         this.add(l5);
         this.add(t5);
         this.add(b);
         b.addActionListener(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);                
         
     }
    public static void main(String[] args) {
        new StudentM();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
         JOptionPane.showMessageDialog(this, "Your Name="+t1.getText()+"\n"+"ID="+t2.getText()+"\n"+" Your Email="+t3.getText()+"\n"+"Dept="+t4.getText()+"\n"+"Course:"+t5.getText()+"\n");
    }
    
}
