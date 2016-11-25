package br.com.alldirect.model;

public class ResultadoModel {

    private int SetorMaisVendidoJogoDois;
    private double SomaVendaDosJogos;
    private int JogoQueVendeuMais;

    public int getSetorMaisVendido() {
        return SetorMaisVendidoJogoDois;
    }

    public void setSetorMaisVendido(int SetorMaisVendido) {
        this.SetorMaisVendidoJogoDois = SetorMaisVendido;
    }

    public double getSomaVendaDosJogos() {
        return SomaVendaDosJogos;
    }

    public void setSomaVendaDosJogos(double SomaVendaDosJogos) {
        this.SomaVendaDosJogos = SomaVendaDosJogos;
    }

    public int getJogoQueVendeuMais() {
        return JogoQueVendeuMais;
    }

    public void setJogoQueVendeuMais(int JogoQueVendeuMais) {
        this.JogoQueVendeuMais = JogoQueVendeuMais;
    }
    
}
