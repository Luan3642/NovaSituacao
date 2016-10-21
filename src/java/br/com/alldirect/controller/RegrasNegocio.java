/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.controller;

import br.com.alldirect.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class RegrasNegocio {

    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    public RegrasNegocio() throws SQLException {
        this.conecta = new ConnectionFactory().getConnection();
    }

    public void ingressosVendidos(int jogo , int setor) {
        
        String sql = "select \n"
                + "*\n"
                + "\n"
                + "from\n"
                + "venda\n"
                + "\n"
                + "inner join\n"
                + "ingresso\n"
                + "\n"
                + "on\n"
                + "ingresso.jogo = ?\n"
                + "and \n"
                + "ingresso.setor = ?";

        try {
            stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, jogo);
            stmt.setInt(2, setor);
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erro no SQL " + e);
        }
    }

    public void consultarVendas() {

    }
}
