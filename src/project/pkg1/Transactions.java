package project.pkg1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener {
    JButton withdraw,deposit,balance;
    String password,Name;
    public Transactions(String password,String Name) {
        this.password=password;
        this.Name=Name;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/background.png"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
            add(image);
     
        image.setBounds(0, 0, 1920, 1080);
        
        
        JLabel theading=new JLabel("Please Select Your Transaction");
        theading.setBounds(200,370,1200,200);
        theading.setForeground(Color.decode("#002446"));
        theading.setFont(new Font("Raleway",Font.BOLD,70));
        image.add(theading);
        
         withdraw=new JButton("Withdraw");
        withdraw.setBounds(120,600,250,70);
        withdraw.setFont(new Font("Arial",Font.BOLD,45));
        withdraw.setBackground(Color.decode("#002446"));
        withdraw.setForeground(Color.white);
          withdraw.addActionListener(this);
        image.add(withdraw);
        
        
           deposit=new JButton("Deposit");
        deposit.setBounds(120,750,250,70);
        deposit.setFont(new Font("Sanserif",Font.BOLD,45));
        deposit.setBackground(Color.decode("#002446"));
        deposit.setForeground(Color.white);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
         balance=new JButton("Balance");
        balance.setBounds(120,910,250,70);
        balance.setFont(new Font("raleway",Font.BOLD,45));
        balance.setBackground(Color.decode("#002446"));
        balance.setForeground(Color.white);
        balance.addActionListener(this);
        image.add(balance);
    
        setSize(1920, 1080);
        
        setLocation(0,0);
        setVisible(true);
    }
   public void actionPerformed(ActionEvent action)
    {
    if (action.getSource()==deposit){
       setVisible(false);
    new Deposit(password,Name).setVisible(true);
       
    }
    else if(action.getSource()==withdraw){
        setVisible(false);
        new Withdraw(password,Name).setVisible(true);
    }
    else if (action.getSource()==balance){
        setVisible(false);
        new Balance(password,Name).setVisible(true);
    }
    }
   
    

    public static void main(String[] args) {
        new Transactions("","");
    }
}
