package App;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
	JButton rules ,back;
	JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.white);
        setSize(500, 500);
        setLocation(200, 150);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Franklin Gothic", Font.BOLD, 40));
        heading.setForeground(Color.blue);
        add(heading);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));
        JLabel ib=new JLabel(img1);
        ib.setBounds(0,0,600,500);
        add(ib);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 45);
        name.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
        name.setForeground(Color.black);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30,144,254));
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("back");
        back.setBounds(915,270 , 120, 25);
        back.setBackground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);
        
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent e) {  
        if(e.getSource()==rules) {
        	String name=tfname.getText();
        	setVisible(false);
        	new Rules(name);
        	
        }else if(e.getSource()==back) {
        	setVisible(false);
        }
    }  
    public static void main(String[] args) {
        new Login();
    }
}
