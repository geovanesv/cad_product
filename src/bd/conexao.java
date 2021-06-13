/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Geovane Araujo
 */

public class conexao {
    private Connection Conexao;
    
    public Connection abrirConexao(){
        
            String url = "jdbc:mysql://localhost:3306/supermercado?userTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "";
            
        try {
            Conexao = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return Conexao;
    }
    
    public void fechaConexao(){
    
        try {
            Conexao.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
        
    }
    
    
}
