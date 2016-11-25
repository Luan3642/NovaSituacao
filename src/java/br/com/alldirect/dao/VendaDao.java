package br.com.alldirect.dao;

import br.com.alldirect.connection.ConnectionFactory;
import br.com.alldirect.model.VendaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDao {

    //Importações Para a conexão 
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    //Método construtor
    public VendaDao() {
        this.conecta = new ConnectionFactory().getConnection();
    }

    // Método adicionar venda
    public void adicionarVenda(VendaModel vendaModel) {
        String sqll = "INSERT INTO VENDA(ID_INGRESSO,ID_CLIENTE,QTDE_V) VALUES (?,?,?)";
        try {
            stmt = conecta.prepareStatement(sqll);
            stmt.setInt(1, vendaModel.getIdIngresso());
            stmt.setInt(2, vendaModel.getIdCliente());
            stmt.setInt(3, vendaModel.getQntdeVenda());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(" Erro ao confirmar a venda " + e);
        }
    }

    public int recuperaIdVenda() {
        int idVenda = 0;
        String sql = ("SELECT * from venda ORDER BY ID_VENDA DESC LIMIT 1");
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                idVenda = (rs.getInt("id_VENDA"));
            }
            stmt.close();
            //return idIngresso;
        } catch (SQLException e) {
            System.out.println(" Erro ao obter o id do ingresso \n" + e);
        }
        return idVenda;
    }

    //Método listar venda 
    public List<VendaModel> getLista() throws SQLException {
        List<VendaModel> listaVenda = new ArrayList<>();
        String sql = "SELECT * FROM VENDA";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                VendaModel vendaModel = new VendaModel();
                vendaModel.setIdCliente(rs.getInt("ID_CLIENTE"));
                vendaModel.setIdIngresso(rs.getInt("ID_INGRESSO"));
                vendaModel.setIdVenda(rs.getInt("ID_VENDA"));
                vendaModel.setQntdeVenda(rs.getInt("QTDE_V"));
                listaVenda.add(vendaModel);
            }
            stmt.close();
            return listaVenda;
        } catch (SQLException e) {
            System.out.println("Erro no SQL " + e);
            return null;
        }
    }
}
