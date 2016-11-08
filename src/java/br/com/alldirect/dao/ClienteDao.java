/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.dao;

import br.com.alldirect.connection.ConnectionFactory;
import br.com.alldirect.model.ClienteModel;
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
public class ClienteDao {
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    public ClienteDao() throws SQLException {
        this.conecta = new ConnectionFactory().getConnection();
    }

    public void adicionarCliente(ClienteModel cliente) throws SQLException {
        String sql = "INSERT INTO CLIENTE(NOME_CLI,"
                + "CPF_CLI, "
                + "IDADE_CLI,"
                + "SEXO_CLI,"
                + "RG,EMAIL,"
                + "CLIENTE_PAIS,CEP"
                + "COMPLEMENTO,"
                + "BAIRRO,"
                + "CIDADE,"
                + "ESTADO) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            System.out.println(" Erro ao adicionar o cliente");
        }
    }

    public void removerCliente() {

    }

    public List <ClienteModel> getLista() throws SQLException {
        List<ClienteModel> listaCliente = new ArrayList<>();
            String sql = "SELECT * FROM CLIENTE";
            try{
                stmt = conecta.prepareStatement(sql);
                rs = stmt.executeQuery();
                
                while (rs.next()){
                    ClienteModel clienteModel = new ClienteModel();
                    clienteModel.setCpfCliente(rs.getInt("cpf"));
                    clienteModel.setIdade(rs.getInt("idade"));
                    clienteModel.setNomeCliente(rs.getString("nomeCliente"));
                    clienteModel.setSexoCliente(rs.getString("sexoCliente"));
                    clienteModel.setRgCliente(rs.getInt("RG"));
                    clienteModel.setEmailCliente(rs.getString("Email"));
                    clienteModel.setClientePais(rs.getString("ClientePais"));
                    clienteModel.setCep(rs.getInt("CEP"));
                    clienteModel.setComplemento(rs.getString("Complemento"));
                    clienteModel.setBairro(rs.getString("Bairro"));
                    clienteModel.setCidade(rs.getString("Cidade"));
                    clienteModel.setEstado(rs.getString("Estado"));
                }
                stmt.close();
                return listaCliente;
            } catch(SQLException e){
                System.out.println("Erro no SQL " +e);
                return null;
                
            }
          }
          public void alterarCliente(){
              
          }
    
}
