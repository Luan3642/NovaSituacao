package br.com.alldirect.model;

public class CadeiraModel{
    
   //Atributos da model
   private int idCadeira;
   private int numeroCadeira;
   private int fileiraCadeira;

   //Métodos Getters e Setters
    public int getIdCadeira() {
        return idCadeira;
    }
    public void setIdCadeira(int idCadeira) {
        this.idCadeira = idCadeira;
    }
    public int getNumeroCadeira() {
        return numeroCadeira;
    }
    public void setNumeroCadeira(int numeroCadeira) {
        this.numeroCadeira = numeroCadeira;
    }
    public int getFileiraCadeira() {
        return fileiraCadeira;
    }
    public void setFileiraCadeira(int fileiraCadeira) {
        this.fileiraCadeira = fileiraCadeira;
    }
}
