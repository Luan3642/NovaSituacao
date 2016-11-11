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
public class IngressoDao {

    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    

    public IngressoDao() throws SQLException {
        this.conecta = new ConnectionFactory().getConnection();
    }

    public void adicionarIngresso(IngressoModel ingresso) throws SQLException {
        String sql = "INSERT INTO INGRESSO(JOGO,SETOR,VALOR,QTDE_LOT) VALUES (?,?,?,?)";
        try {
            stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, ingresso.getJogoIngresso());
            stmt.setInt(2, ingresso.getQtdeLot());
            stmt.setInt(3, ingresso.getSetorIngresso());
            stmt.setDouble(4, ingresso.getValorIngresso());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(" Erro ao adicionar o ingresso");
        }
        VendaModel vendaModel = new VendaModel();
        String sqll = "INSERT INTO VENDA(QTDE_V,ID_CLIENTE,ID_INGRESSO) VALUES (?,?,?)";
        try {
            stmt = conecta.prepareStatement(sqll);
            stmt.setInt(1, vendaModel.getIdIngresso());
            stmt.setInt(2, vendaModel.getIdCliente());
            stmt.setInt(3, vendaModel.getQntdeVenda());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(" Erro ao adicionar o ingresso");
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
