/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.dao;

import br.com.alldirect.connection.ConnectionFactory;
import br.com.alldirect.model.IngressoModel;
import br.com.alldirect.model.VendaModel;
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
public class SetorJogoLotadoDao {
    
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;
    
     public SetorJogoLotadoDao() throws SQLException {
        this.conecta = new ConnectionFactory().getConnection();
    }
     
     public List<IngressoModel> getLista() throws SQLException {
        List<IngressoModel> ListaIngresso = new ArrayList<>();

        String sql = "SELECT * FROM INGRESSO WHERE SETOR =? AND JOGO =?";

        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                IngressoModel IngressoModel = new IngressoModel();
                IngressoModel.setQtdeLot(rs.getInt("qtdeLot"));
                IngressoModel.setSetorIngresso(rs.getInt("setorIngresso"));
                IngressoModel.setJogoIngresso(rs.getInt("JogoIngresso"));
                IngressoModel.setValorIngresso(rs.getDouble("valorIngresso"));
                
            }
            stmt.close();
            return ListaIngresso;
        } catch (SQLException e) {
            System.out.println("Erro no SQL" + e);
            return null;
        }
}
}
