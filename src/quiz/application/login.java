/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Dell
 */
public class login extends JFrame implements ActionListener {
    
    
    JButton Rules,back;
    JTextField tfname;
    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/1.jpg"));
        JLabel image =new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading =new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,114,254));
        add(heading);
        
        JLabel name =new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,114,254));
        add(name);
        
        tfname= new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        Rules =new JButton("Next");
        Rules.setBounds(735,270,120,25);
        Rules.setBackground(new Color(30,144,254));
        Rules.setForeground(Color.WHITE);
        Rules.addActionListener(this);
        add(Rules);
        
        back =new JButton("Exit");
        back.setBounds(920,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        setSize(1200,500);
        setLocation(200,200);
     setVisible(true);
     
        
    }
    
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()== Rules) {
         String name = tfname.getText();
         setVisible(false);
         new Rules(name);
     } else if(ae.getSource() == back) {
        setVisible(false); 
     }
    }
    
    
    
    
    public static void main(String[] args){
        new login();
    }
            
}
