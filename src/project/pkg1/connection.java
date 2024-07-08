
package project.pkg1;
import java.sql.*;
public class connection {
    /*JDBC CONNECTION 5 STEPS
    register drive 
    create connection
    create statement
    execute querry
    close connection*/
    Connection c;
    Statement s;
    public connection(){
        try{
            c=DriverManager.getConnection("jdbc:mysql:///banksystem","root","pythOne45");
            s=c.createStatement();
        }
        
     catch (Exception e){
            System.out.println(e);
    }
    }
}