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
    private int setorIngresso;
    private double valorIngresso;
    private int qtdeLot;
    private int jogoIngresso;

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    public int getSetorIngresso() {
        return setorIngresso;
    }

    public void setSetorIngresso(int setorIngresso) {
        this.setorIngresso = setorIngresso;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public int getQtdeLot() {
        return qtdeLot;
    }

    public void setQtdeLot(int qtdeLot) {
        this.qtdeLot = qtdeLot;
    }

    public int getJogoIngresso() {
        return jogoIngresso;
    }

    public void setJogoIngresso(int jogoIngresso) {
        this.jogoIngresso = jogoIngresso;
    }

    
}
