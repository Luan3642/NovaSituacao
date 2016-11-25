package br.com.alldirect.model;

public class ResultadoModel {
    private String setorMaisVendidoJogoDois;
    private double somaVendaDosJogos;
    private int jogoQueVendeuMais;

    public String getSetorMaisVendidoJogoDois() {
        return setorMaisVendidoJogoDois;
    }

    public void setSetorMaisVendidoJogoDois(String setorMaisVendidoJogoDois) {
        this.setorMaisVendidoJogoDois = setorMaisVendidoJogoDois;
    }

    public double getSomaVendaDosJogos() {
        return somaVendaDosJogos;
    }

    public void setSomaVendaDosJogos(double somaVendaDosJogos) {
        this.somaVendaDosJogos = somaVendaDosJogos;
    }

    public int getJogoQueVendeuMais() {
        return jogoQueVendeuMais;
    }

    public void setJogoQueVendeuMais(int jogoQueVendeuMais) {
        this.jogoQueVendeuMais = jogoQueVendeuMais;
    }
}