/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.controller;

import br.com.alldirect.connection.ConnectionFactory;
import br.com.alldirect.dao.QntdVendidoDao;
import br.com.alldirect.model.ResultadoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class RegrasNegocio {

    private PreparedStatement stmt;
    private ResultSet rs;
    private  Connection conecta;

    public RegrasNegocio() {
        this.conecta = new ConnectionFactory().getConnection();
    }

    /**
     *
     */
    public List <ResultadoModel> resultados(){
        
         List<ResultadoModel> result = new ArrayList<>();
        ResultadoModel resultadoModel = new ResultadoModel();
        int SetorMaisVendido = 0;
        int JogoQueVendeuMais = 0;
        double SomaVendaDosJogos = 0;

        QntdVendidoDao qntVendidoDao = new QntdVendidoDao();
        // setor mais lotado segundo jogo
        int setorAmarelo = qntVendidoDao.setorAmareloJogo2();
        int setorVerde = qntVendidoDao.setorVerdeJogo2();
        int setorAzul = qntVendidoDao.setorAzulJogo2();
        int setorBranco = qntVendidoDao.setorBrancoJogo2();

        if (setorAmarelo > setorVerde && setorAmarelo > setorAzul && setorAmarelo > setorBranco) {
            SetorMaisVendido = setorAmarelo;
        }
        if (setorVerde > setorAmarelo && setorVerde > setorAzul && setorVerde > setorBranco) {
            SetorMaisVendido = setorVerde;
        }
        if (setorAzul > setorAmarelo && setorAzul > setorVerde && setorAzul > setorBranco) {
            SetorMaisVendido = setorAzul;
        }
        if (setorBranco > setorAmarelo && setorBranco > setorVerde && setorBranco > setorAzul) {
            SetorMaisVendido = setorBranco;
        }
        // jogo que mais vendeu
        int vendaJogoDois = qntVendidoDao.vendasSegundoJogo();
        int vendaJogoUm = qntVendidoDao.vendasPrimeiroJogo();

        if (vendaJogoUm > vendaJogoDois) {
            JogoQueVendeuMais = vendaJogoUm;
        }
        if (vendaJogoUm < vendaJogoDois) {
            JogoQueVendeuMais = vendaJogoDois;
        }
        // soma dos ingressos
        double somaVendasDoisJogos = qntVendidoDao.somaVendaDosJogos();
        
        SomaVendaDosJogos = somaVendasDoisJogos;
        
      resultadoModel.setSetorMaisVendido(SetorMaisVendido);
      resultadoModel.setJogoQueVendeuMais(JogoQueVendeuMais);
      resultadoModel.setSomaVendaDosJogos(SomaVendaDosJogos);
        
        result.add(resultadoModel);
        return result;
    }
}
