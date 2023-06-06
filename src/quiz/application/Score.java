
package quiz.application;

import java.awt.*;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
     setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/20181124_135047.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1440,392);
        add(image);
        
        JLabel heading = new JLabel("Thankyou "+ name +" for playing Smple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        
        JLabel lblScore = new JLabel("Your score is "+ score);
        lblScore.setBounds(350,200,300,30);
        lblScore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblScore);
        
        JButton submit =new JButton("Play Again");
        submit.setBounds(350,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
    }
    public static void main(String[] args){
        new Score("User",0);
    }
}
