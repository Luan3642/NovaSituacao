package br.com.alldirect.model;

import java.util.Date;

public class JogoModel {
    
    //Atributos 
    private int idJogo;
    private String numeroJogo;
    private Date dataJogo;

    //Métodos Getters e Setters
    public int getIdJogo() {
        return idJogo;
    }
    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }
    public String getNumeroJogo() {
        return numeroJogo;
    }
    public void setNumeroJogo(String numeroJogo) {
        this.numeroJogo = numeroJogo;
    }
    public Date getDataJogo() {
        return dataJogo;
    }
    public void setDataJogo(Date dataJogo) {
        this.dataJogo = dataJogo;
    }
}
