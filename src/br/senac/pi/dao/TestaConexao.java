
package br.senac.pi.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Connection conectaDB = new ConectaDB().conectaDB();
        System.out.print("Conexão Realizada com sucesso");
        conectaDB.close();
    
    }
    
}
