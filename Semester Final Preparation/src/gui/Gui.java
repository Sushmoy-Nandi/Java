package gui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    public Gui() {

        JLabel usrname = new JLabel("Username :");
        usrname.setBounds(30, 50, 100, 20);

        add(usrname);

        JTextField textField = new JTextField();
        textField.setBounds(30, 70, 200, 30);
//        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        textField.setBackground(new Color(255, 179, 0));
        add(textField);

        JLabel passname = new JLabel("Password :");
        passname.setBounds(30, 100, 100, 20);
//        passname.setFont(new Font("Tahoma", Font.BOLD, 17));
//        passname.setForeground(Color.BLACK);
        add(passname);

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(30, 120, 200, 30);
//        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        jPasswordField.setBackground(new Color(255, 179, 0));
        add(jPasswordField);

        JButton submit = new JButton("LOGIN");
        submit.setBounds(50, 150, 100, 40);
        add(submit);


        setSize(300, 500);
        //setLocation(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Gui gui = new Gui();
    }
}
