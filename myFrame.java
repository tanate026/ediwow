import java.awt.*;

import javax.swing.*;public class myFrame{

public static void main(String args[]){    //create Elements

    JFrame frame = new JFrame("My first Frame");    JLabel label = new JLabel("Email");    JLabel label1 = new JLabel("Username");    JLabel label2 = new JLabel("Password");    JButton button = new JButton("Login");    JTextField field = new JTextField("");

    JTextField field2 = new JTextField("");

    JPasswordField field3 = new JPasswordField("");    JPanel panel = new JPanel(new BorderLayout());    //create label object

    frame.getContentPane().add(label,BorderLayout.CENTER);

    frame.getContentPane().add(button,BorderLayout.CENTER);

    frame.getContentPane().add(field,BorderLayout.CENTER);

    frame.getContentPane().add(field2,BorderLayout.CENTER);

    frame.getContentPane().add(field3,BorderLayout.CENTER);

    frame.getContentPane().add(label1,BorderLayout.CENTER);

    frame.getContentPane().add(panel,BorderLayout.CENTER);

    frame.getContentPane().add(label2,BorderLayout.CENTER);    //set frame Options

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setVisible(true);

    frame.setSize(310,300);

    frame.setLayout(null);    label.setLayout(null);

    label.setSize(100,100);

    label.setForeground(Color.WHITE);    label1.setLayout(null);

    label1.setSize(200,200);

    label1.setForeground(Color.WHITE);    label2.setLayout(null);

    label2.setSize(300,300);

    label2.setForeground(Color.WHITE);    field.setVisible(true);

    field.setSize(100,100);

    field.setBounds(70,35,180,30);    field2.setVisible(true);

    field2.setSize(100,100);

    field2.setBounds(70,85,180,30);    field3.setVisible(true);

    field3.setSize(100,100);

    field3.setBounds(70,135,180,30);    button.setBounds(100,200,95,30);

    button.setBackground(Color.GRAY);

    button.setForeground(Color.WHITE);    panel.setBounds(0,0,500,500);

    panel.setBackground(Color.BLACK);

    }

}