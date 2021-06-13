/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Geovane Araujo
 */
public class produtos {
    
    private int idProd;
    private String nomeProd;
    private String descProd;
    private int qtdeProd;
    private double valUnitProd ;
    private double valTotalProd;
    
    public produtos(){}
    
     public produtos(int idProd, String nomeProd, String descProd, int qtdeProd, double valUnitProd, double valTotalProd) {
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.descProd = descProd;
        this.qtdeProd = qtdeProd;
        this.valUnitProd = valUnitProd;
        this.valTotalProd = valTotalProd;
    }

    

    public produtos( String nomeProd, String descProd, int qtdeProd, double valUnitProd, double valTotalProd) {
        
        this.nomeProd = nomeProd;
        this.descProd = descProd;
        this.qtdeProd = qtdeProd;
        this.valUnitProd = valUnitProd;
        this.valTotalProd = valTotalProd;
    }

     public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public int getQtdeProd() {
        return qtdeProd;
    }

    public void setQtdeProd(int qtdeProd) {
        this.qtdeProd = qtdeProd;
    }

    public double getValUnitProd() {
        return valUnitProd;
    }

    public void setValUnitProd(double valUnitProd) {
        this.valUnitProd = valUnitProd;
    }

    public double getValTotalProd() {
        return valTotalProd;
    }

    public void setValTotalProd(double valTotalProd) {
        this.valTotalProd = valTotalProd;
    }
    
}
