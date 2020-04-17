
package br.senac.pi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaDB {
    
    public static Connection conectaDB() throws ClassNotFoundException {
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/estoquedb","postgres","root");
            return conn;
        } catch (SQLException sqlError) {
        
            JOptionPane.showMessageDialog(null, sqlError);
            return null;
        }
            
    
    
    
    }
    
}
