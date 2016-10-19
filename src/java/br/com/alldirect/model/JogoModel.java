/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.model;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class JogoModel {
    
    private int idJogo;
    private String numeroJogo;
    private Date dataJogo;

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
