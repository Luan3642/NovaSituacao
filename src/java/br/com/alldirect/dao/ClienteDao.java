package br.com.alldirect.dao;

import br.com.alldirect.connection.ConnectionFactory;
import br.com.alldirect.model.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    public ClienteDao() throws SQLException {
        this.conecta = new ConnectionFactory().getConnection();
    }

    // Método adiciona cliente
    public void adicionarCliente(ClienteModel cliente) throws SQLException {
        String sql = "INSERT INTO CLIENTE(NOME_CLI,"
                + "CPF_CLI, "
                + "IDADE_CLI,"
                + "SEXO_CLI,"
                + "RG,"
                + "EMAIL,"
                + "CLIENTE_PAIS,"
                + "CEP,"
                + "COMPLEMENTO,"
                + "BAIRRO,"
                + "CIDADE,"
                + "ESTADO) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            stmt = conecta.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setInt(2, cliente.getCpfCliente());
            stmt.setInt(3, cliente.getIdade());
            stmt.setString(4, cliente.getSexoCliente());
            stmt.setInt(5, cliente.getRgCliente());
            stmt.setString(6, cliente.getEmailCliente());
            stmt.setString(7, cliente.getClientePais());
            stmt.setInt(8, cliente.getCep());
            stmt.setString(9, cliente.getComplemento());
            stmt.setString(10, cliente.getBairro());
            stmt.setString(11, cliente.getCidade());
            stmt.setString(12, cliente.getEstado());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(" Erro ao adicionar o cliente" + e);
        }
    }

    // Método listar cliente
    public List<ClienteModel> getLista() throws SQLException {
        List<ClienteModel> listaCliente = new ArrayList<>();
        String sql = "SELECT * FROM CLIENTE";
        try {
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ClienteModel clienteModel = new ClienteModel();
                clienteModel.setIdCliente(rs.getInt("ID_CLI"));
                clienteModel.setCpfCliente(rs.getInt("CPF_CLI"));
                clienteModel.setIdade(rs.getInt("IDADE_CLI"));
                clienteModel.setClientePais(rs.getString("CLIENTE_PAIS"));
                clienteModel.setNomeCliente(rs.getString("NOME_CLI"));
                clienteModel.setSexoCliente(rs.getString("SEXO_CLI"));
                clienteModel.setComplemento(rs.getString("COMPLEMENTO"));
                clienteModel.setBairro(rs.getString("BAIRRO"));
                clienteModel.setEstado(rs.getString("ESTADO"));
                listaCliente.add(clienteModel);
            }
            stmt.close();
            return listaCliente;
        } catch (SQLException e) {
            System.out.println("Erro no SQL " + e);
            return null;
        }
    }
}
