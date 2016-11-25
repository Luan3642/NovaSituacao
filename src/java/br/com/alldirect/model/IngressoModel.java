package br.com.alldirect.model;


public class IngressoModel {
    
    //Atributos da model
    private int idIngresso;
    private int setorIngresso;
    private double valorIngresso;
    private int qtdeLot;
    private int jogoIngresso;

    //Métodos Getters e Setters
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
