package br.com.alldirect.controller;

import br.com.alldirect.connection.ConnectionFactory;
import br.com.alldirect.dao.QntdVendidoDao;
import br.com.alldirect.model.ResultadoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RegrasNegocio {

    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    public RegrasNegocio() {
        this.conecta = new ConnectionFactory().getConnection();
    }

    public List<ResultadoModel> getLista() {

        List<ResultadoModel> result = new ArrayList<>();
        ResultadoModel resultadoModel = new ResultadoModel();

        String resultado = ("");
        int JogoQueVendeuMais = 0;
        double SomaVendaDosJogos;

        QntdVendidoDao qntVendidoDao = new QntdVendidoDao();
        // setor mais lotado segundo jogo
        int setorAmarelo = qntVendidoDao.setorAmareloJogo2();
        int setorVerde = qntVendidoDao.setorVerdeJogo2();
        int setorAzul = qntVendidoDao.setorAzulJogo2();
        int setorBranco = qntVendidoDao.setorBrancoJogo2();

        if (setorAmarelo > setorVerde && setorAmarelo > setorAzul && setorAmarelo > setorBranco) {
            resultado = (" O setor Amarelo ");
        }
        if (setorVerde > setorAmarelo && setorVerde > setorAzul && setorVerde > setorBranco) {
            resultado = ("O setor Verde ");
        }
        if (setorAzul > setorAmarelo && setorAzul > setorVerde && setorAzul > setorBranco) {
            resultado = ("O setor Azul ");
        }
        if (setorBranco > setorAmarelo && setorBranco > setorVerde && setorBranco > setorAzul) {
            resultado = ("O setor Branco ");
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

        resultadoModel.setSetorMaisVendidoJogoDois(resultado);
        resultadoModel.setJogoQueVendeuMais(JogoQueVendeuMais);
        resultadoModel.setSomaVendaDosJogos(SomaVendaDosJogos);

        result.add(resultadoModel);
        return result;
    }
}
