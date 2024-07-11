
package project.pkg1;
import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame {
    Deposit(){
   setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/back2.png"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
            add(image); 
        image.setBounds(0, 0, 1920, 1080);
        
        JLabel heading=new  JLabel("Enter The Amount You Want To Withdraw");
          heading.setBounds(250,340,1400,200);
        heading.setForeground(Color.decode("#002446"));
        heading.setFont(new Font("Raleway",Font.BOLD,70));
        image.add(heading);
        
        JTextField amount=new JTextField();
        amount.setBounds(500,600,800,80);
        amount.setFont(new Font("Raleway",Font.BOLD,40));
        amount.setBackground(Color.decode("#002446"));
        amount.setForeground(Color.white);
        image.add(amount);
        
        
     
        
        setSize(1920, 1080);
        
        setLocation(0,0);
        setVisible(true);
            
    }

public static void main(String args[]){
new Deposit();

}}