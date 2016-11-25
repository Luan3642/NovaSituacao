/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.dao;

import br.com.alldirect.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class QntdVendidoDao {

    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    public QntdVendidoDao() {
        this.conecta = new ConnectionFactory().getConnection();
    }
    //setor mais lotado jogo 2
    public int setorAmareloJogo2() {
        int qntdVendidoSet1 = 0;
        String sql = "SELECT count(setor) FROM sallv.ingresso where jogo = 2 and setor = 1";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                qntdVendidoSet1 = (rs.getInt("count(setor)"));
            }
            stmt.close();
            return qntdVendidoSet1;
        } catch (SQLException e) {
            System.out.println(" Erro ao obter a quantidade de ingressos vendidos \n" + e);
        }
        return qntdVendidoSet1;
    }
    public int setorAzulJogo2() {
         int qntdVendidoSet2 = 0;
        String sql = "SELECT count(setor) FROM sallv.ingresso where jogo = 2 and setor = 2";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                qntdVendidoSet2 = (rs.getInt("count(setor)"));
            }
            stmt.close();
            return qntdVendidoSet2;
        } catch (SQLException e) {
            System.out.println(" Erro ao obter a quantidade de ingressos vendidos \n" + e);
        }
        return qntdVendidoSet2;
    }
    public int setorVerdeJogo2() {
        int qntdVendidoSet3 = 0;
        String sql = "SELECT count(setor) FROM sallv.ingresso where jogo = 2 and setor = 3";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                qntdVendidoSet3 = (rs.getInt("count(setor)"));
            }
            stmt.close();
            return qntdVendidoSet3;
        } catch (SQLException e) {
            System.out.println(" Erro ao obter a quantidade de ingressos vendidos \n" + e);
        }
        return qntdVendidoSet3;
    }
    public int setorBrancoJogo2() {
        int qntdVendidoSet4 = 0;
        String sql = "SELECT count(setor) FROM sallv.ingresso where jogo = 2 and setor = 4";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                qntdVendidoSet4 = (rs.getInt("count(setor)"));
                
            }
            stmt.close();
            return qntdVendidoSet4;
        } catch (SQLException e) {
            System.out.println(" Erro ao obter a quantidade de ingressos vendidos \n" + e);
        }
        return qntdVendidoSet4;
    }
    //jogo que vendeu mais
    public int vendasSegundoJogo(){
        int jogoQueVendeuMais = 0;
        String sql = "SELECT count(jogo) FROM sallv.ingresso where jogo = 2;";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                jogoQueVendeuMais = (rs.getInt("count(jogo)"));
                
            }
            stmt.close();
            return jogoQueVendeuMais;
        } catch (SQLException e) {
            System.out.println(" Erro ao obter a quantidade de ingressos vendidos \n" + e);
        }
        return jogoQueVendeuMais;
    }
    public int vendasPrimeiroJogo(){
        int jogoQueVendeuMais = 0;
        String sql = "SELECT count(jogo) FROM sallv.ingresso where jogo = 1;";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                jogoQueVendeuMais = (rs.getInt("count(jogo)"));
                
            }
            stmt.close();
            return jogoQueVendeuMais;
        } catch (SQLException e) {
            System.out.println(" Erro ao obter a quantidade de ingressos vendidos \n" + e);
        }
        return jogoQueVendeuMais;
    }
    // valor total dos ingressos vendidos
    public double somaVendaDosJogos(){
        double somaDasVendasJogos = 0;
        String sql = "SELECT sum(valor) FROM sallv.ingresso";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                somaDasVendasJogos = (rs.getInt("sum(valor)"));
                
            }
            stmt.close();
            return somaDasVendasJogos;
        } catch (SQLException e) {
            System.out.println(" Erro ao obter a quantidade de ingressos vendidos \n" + e);
        }
        return somaDasVendasJogos;
    }
}   

