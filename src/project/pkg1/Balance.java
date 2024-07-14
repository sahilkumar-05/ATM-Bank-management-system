
package project.pkg1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;


public class Balance extends JFrame implements ActionListener{
    JButton back;
    String Name,password;
    public Balance(String password,String Name){
        this.Name=Name;
        this.password=password;
       setLayout(null);
       //background image//
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/back2.png"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1920, 1080);
            add(image); 
            
            
        
        back=new JButton("Back");
        back.setBounds(950,750,250,80);
        back.setBackground(Color.decode("#002446"));
        back.setFont(new Font("Raleway",Font.BOLD,35));
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);
        
        
        connection connect=new connection();
        double balance=0;
        try {
            ResultSet rs=connect.s.executeQuery("select * from bank where Password = '"+password+"'");
            while(rs.next()){
            if (rs.getString("type").equals("Deposit")){
                balance+= Integer.parseInt(rs.getString("amount"));
                
            }
            else{
                balance-= Integer.parseInt(rs.getString("amount"));
            }}
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
            
            
            JLabel text=new JLabel("Your Current Balance Acoount is Rs: "+balance);
          
          text.setBounds(250,340,2000,200);
        text.setForeground(Color.decode("#002446"));
        text.setFont(new Font("Raleway",Font.BOLD,70));
        image.add(text);
    
                    
            
           setSize(1920, 1080);
        setLocation(0,0);
        setVisible(true);
            
    }
    
    
    
    // abstract method//
    
    public void actionPerformed(ActionEvent action){
        if (action.getSource()==back){
            setVisible(false);
            new Transactions(password,Name).setVisible(true);
        }
    }
    
    
    
    
    //main class//
    public static void main(String args[]){
        new Balance("","");
    }

    
    
}

