/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.dao;

import br.com.alldirect.connection.ConnectionFactory;
import br.com.alldirect.model.IngressoModel;
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
public class IngressoDao {
    
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    public IngressoDao() throws SQLException {
        this.conecta = new ConnectionFactory().getConnection();

    }

    public void adicionarIngresso(IngressoModel ingresso) throws SQLException {
        String sql = "INSERT INTO INGRESSO(CLIENTEINGRESSO,CADEIRAINGRESSO,JOGOINGRESSO) VALUES (?,?,?)";
        try {
            stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, ingresso.getIdIngresso());
            stmt.setInt(2, ingresso.getClienteIngresso());
            stmt.setInt(3, ingresso.getCadeiraIngresso());
            stmt.setInt(4, ingresso.getJogoIngresso());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(" Erro ao adicionar o cliente");

        }
    }

    public void removerIngresso() {

    }

    public List<IngressoModel> getLista() throws SQLException {
        List<IngressoModel> ListaIngresso = new ArrayList<>();

        String sql = "SELECT * FROM INGRESSO";

        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                IngressoModel IngressoModel = new IngressoModel();
                IngressoModel.setClienteIngresso(rs.getInt("clienteIngresso"));
                IngressoModel.setCadeiraIngresso(rs.getInt("CadeiraIngresso"));
                IngressoModel.setJogoIngresso(rs.getInt("JogoIngresso"));
            }
            stmt.close();
            return ListaIngresso;

        } catch (SQLException e) {
            System.out.println("Erro no SQL"+e);
            return null;

        }

    }
    
}
