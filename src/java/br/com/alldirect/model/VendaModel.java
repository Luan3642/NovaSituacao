/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.model;

/**
 *
 * @author Aluno
 */
public class VendaModel {
    
    private int idVenda;
    private int qntdeVenda;
    private int idCliente;
    private int idIngresso;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQntdeVenda() {
        return qntdeVenda;
    }

    public void setQntdeVenda(int qntdeVenda) {
        this.qntdeVenda = qntdeVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }
    
}
