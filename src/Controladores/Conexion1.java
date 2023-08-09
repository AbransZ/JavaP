
package Controladores;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion1 {
    
    String bd="proyecto";
    String url="jdbc:mysql://localhost:3307/"+bd;
    String user="root";
    String pass="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    

    public Conexion1() {
    }
    
    public Connection conectar() {
    
        try
        {
            Class.forName(driver);
            cx=DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException |SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error " +ex.getMessage());
            
        }
        return cx;
    }
    
    public void desconectar(){
        try
        {
            cx.close();
        } catch (SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "Error " +ex.getMessage());  
        }
    }

    
 
}

