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
public class IngressoModel {
    
    private int idIngresso;
    private int clienteIngresso;
    private int cadeiraIngresso;
    private int jogoIngresso;

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    public int getClienteIngresso() {
        return clienteIngresso;
    }

    public void setClienteIngresso(int clienteIngresso) {
        this.clienteIngresso = clienteIngresso;
    }

    public int getCadeiraIngresso() {
        return cadeiraIngresso;
    }

    public void setCadeiraIngresso(int cadeiraIngresso) {
        this.cadeiraIngresso = cadeiraIngresso;
    }

    public int getJogoIngresso() {
        return jogoIngresso;
    }

    public void setJogoIngresso(int jogoIngresso) {
        this.jogoIngresso = jogoIngresso;
    }
    
}
