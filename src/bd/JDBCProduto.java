/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.produtos;

/**
 *
 * @author Geovane Araujo
 */
public class JDBCProduto {
    
    Connection conexao;

    public JDBCProduto(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserirProduto(produtos p){
        String sql = "insert into produtos(nomeProd,descProd,qtdeProd,valUnitProd,valTotalProd) values(?,?,?,?,?)";
        PreparedStatement ps;
        
        try{
            
            ps = this.conexao.prepareStatement(sql);
           // ps.setInt(0, p.getIdProd());
            ps.setString(1, p.getNomeProd());
            ps.setString(2, p.getDescProd());
            ps.setInt(3, p.getQtdeProd());
            ps.setDouble(4, p.getValUnitProd());
            ps.setDouble(5, p.getValTotalProd());
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    
    public ArrayList<produtos> listarProdutos(){
        ArrayList<produtos> Produtos = new ArrayList<produtos>();
        String sql = "select * from produtos";
        
        try{
            
            
            Statement declaracao = conexao.createStatement();
            
            ResultSet resposta = declaracao.executeQuery(sql);
            
            while(resposta.next()){
                int idProd = resposta.getInt("idProd");
                String nomeProd = resposta.getString("nomeProd");
                String descProd = resposta.getString("descProd");
                int qtdeProd = resposta.getInt("qtdeProd");
                double valUnitProd = resposta.getFloat("valUnitProd");
                double valTotalProd = resposta.getFloat("valTotalProd");
                
                produtos p = new produtos(idProd,nomeProd,descProd,qtdeProd,valUnitProd,valTotalProd);
                
                Produtos.add(p);
                
            }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
        return Produtos;
    }
    
    //pesquisar produto
    public ArrayList<produtos> pesquisarProduto(String nome){
        
        ArrayList<produtos> Produtos = new ArrayList<produtos>();
        String x = "'%"+nome+"%'";
        String sql = "select * from produtos where nomeProd LIKE "+x;
        
        
        try{
            
            
            Statement declaracao = conexao.createStatement();
            
            ResultSet resposta = declaracao.executeQuery(sql);
            
            while(resposta.next()){
                int idProd = resposta.getInt("idProd");
                String nomeProd = resposta.getString("nomeProd");
                String descProd = resposta.getString("descProd");
                int qtdeProd = resposta.getInt("qtdeProd");
                double valUnitProd = resposta.getFloat("valUnitProd");
                double valTotalProd = resposta.getFloat("valTotalProd");
                
                produtos p = new produtos(idProd,nomeProd,descProd,qtdeProd,valUnitProd,valTotalProd);
                
                Produtos.add(p);
                
            }
        
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
        return Produtos;
    }
    
    public void apagarTudo(){
        String sql = "delete from produtos where idProd != 0";
        PreparedStatement ps;
        
        try{
        
            ps = this.conexao.prepareStatement(sql);
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
    //apagar item especifico
    public void apagarItem(produtos p){
        
        String sql = "delete from produtos where idProd = ?";
        PreparedStatement ps;
        
        try{
        
            ps = this.conexao.prepareStatement(sql);
            ps.setInt(1, p.getIdProd());
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro, ao excluir dados!!!!"+e);
        }
    }
    
    
    
    
    /*
    public void apagar(){
        String sql = "delete from produtos where idProd != 0";
        PreparedStatement ps;
        
        try{
        
            ps = this.conexao.prepareStatement(sql);
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    */
    
    }
    
    

        
    
