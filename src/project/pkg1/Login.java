
package project.pkg1;




import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JButton login,Signup;
    JTextField nameTextField;
    JLabel name,password;
    JPasswordField passwordField;
    Login(){
        setLayout(null);
       
        setTitle("Bank Management System");
    
                
        JLabel heading=new JLabel("Welcome To Bank");
        heading.setFont(new Font("Osward",Font.BOLD,38));
       heading.setBounds(200,40,400,40);
        add(heading);
        
        //bank username headig//
            name=new JLabel("Usernaem");
        name.setFont(new Font("Raleway",Font.BOLD,28));
        name.setBounds(120,150,150,30);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setBounds(300,150,230,30);
        add(nameTextField);
        
        //password//
         password=new JLabel("Password");
        password.setFont(new Font("Raleway",Font.BOLD,28));
       password.setBounds(120,220,400,40);
        add(password);
        
         passwordField=new JPasswordField();
        passwordField.setBounds(300, 220, 230, 30);
        add(passwordField);
        
        //buttons//
         login=new JButton("Log IN");
        login.setBounds(300, 300, 100  , 30);
         login.setBackground(Color.orange);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        
         Signup=new JButton("Sign up");
        Signup.setBounds(430, 300, 100  , 30);
        Signup.setBackground(Color.orange);
        Signup.setForeground(Color.white);
        Signup.addActionListener(this);
        
        add(Signup);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800,400);
        setVisible(true);
        setLocation(350, 200);
        
        
        
        
        
        
    }
    public void actionPerformed(ActionEvent action){
        if(action.getSource()==Signup){
            setVisible(false);
            Signup ob1=new Signup();
           
        }
        else if (action.getSource()== login){
            
        }
        
    }
    
    public static void main(String args[]){
        new Login();
    }
}

