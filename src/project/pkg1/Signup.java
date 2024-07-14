
package project.pkg1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Signup extends JFrame implements ActionListener{
    JLabel name,email,password,gender,city;
JTextField nameTextField,emailTextField,cityTextField;
JPasswordField passwordTextField;
    JButton Signup;
    JRadioButton male,female;
    Signup(){
        setLayout(null);
       setTitle("Signup Form");
    
                
        JLabel heading=new JLabel("Signup Form");
        heading.setFont(new Font("Raleway",Font.BOLD,38));
        heading.setForeground(Color.decode("#002446"));
       heading.setBounds(250,20,400,60);
        add(heading);
        
        //bank username headig//
         name=new JLabel("Username");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(120,150,150,40);
        name.setForeground(Color.decode("#002446"));
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setBounds(300,155,230,35);
        add(nameTextField);
        
            email=new JLabel("Email");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setForeground(Color.decode("#002446"));
        email.setBounds(120,200,150,40);
        add(email);
        
         emailTextField=new JTextField();
        emailTextField.setBounds(300,205,230,35);
        add(emailTextField);
        
         password=new JLabel("Password");
        password.setFont(new Font("Raleway",Font.BOLD,20));
        password.setForeground(Color.decode("#002446"));
        password.setBounds(120,250,150,40);
        add(password);
        
         passwordTextField=new JPasswordField();
        passwordTextField.setBounds(300,255,230,35);
        add(passwordTextField);
        
            
        
              gender=new JLabel("Gender");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setForeground(Color.decode("#002446"));
        gender.setBounds(120,300,150,40);
        add(gender);
        
          male=new JRadioButton("Male");
        male.setBounds(300,305,100,35);
        male.setBackground(Color.white);
        add(male);
        
          female=new JRadioButton("Female");
        female.setBounds(420,305,100,35);
        female.setBackground(Color.white);
        
        add(female);
        ButtonGroup group=new ButtonGroup();
        group.add(male);
        group.add(female);
        
                      city=new JLabel("City");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setForeground(Color.decode("#002446"));
        city.setBounds(120,350,150,40);
        add(city);
        
         cityTextField=new JTextField();
        cityTextField.setBounds(300,355,230,35);
        add(cityTextField);
        
        
        Signup=new JButton("Sign up");
        Signup.setBounds(120, 465, 410, 35);
        Signup.setBackground(Color.decode("#002446"));
        Signup.setForeground(Color.white);
        Signup.addActionListener(this);
        add(Signup);
       
        
        

         getContentPane().setBackground(Color.WHITE);
        setSize(800,600);
        setVisible(true);
        setLocation(350, 200);
        
        
    }
    public void actionPerformed(ActionEvent action)
    {
    String name=nameTextField.getText();
    String email=emailTextField.getText();
    
    String pass=passwordTextField.getText();
    String city=cityTextField.getText();
    String gender =null;
    
    try{
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Require!");}
        else if(email.equals("")){
        JOptionPane.showMessageDialog(null, "email is required");
    }
          else if(pass.equals("")){
        JOptionPane.showMessageDialog(null, "password is required");
        
    }
          else if(!male.isSelected() && !female.isSelected()) {
            
                JOptionPane.showMessageDialog(null, "gender is require");
                }          
            else if(city.equals("")){
        JOptionPane.showMessageDialog(null, "city is required");    
           }
      
        else{
            connection connect=new connection();
            String querry1="insert into signup values('"+name+"','"+email+"','"+pass+"','"+city+"','"+gender+"')";
            String querry2="insert into login values('"+name+"','"+pass+"')";
            connect.s.execute(querry1);
            connect.s.execute(querry2);
           JOptionPane.showMessageDialog(null, "succussefully signup");
          
           setVisible(false);
          
           Login login=new Login();
           login.setVisible(true);
        }
        
    }catch(Exception e){
        System.out.println(e);
    }
    
    
    
    }
            
    public static void main(String args[]){
       new Signup();
    }
}
