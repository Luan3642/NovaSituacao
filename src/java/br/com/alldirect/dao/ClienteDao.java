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
        String sql = "INSERT INTO CLIENTE(NOMECLIENTE,CPFCLIENTE, DATANASCIMENTO,SEXOCLIENTE) VALUES (?,?,?,?,?)";
        try {
            stmt = conecta.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setInt(2, cliente.getCpfCliente());
            stmt.setDate(3, cliente.getDataNascimento());
            stmt.setString(4, cliente.getSexoCliente());
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
                    clienteModel.setDataNascimento(rs.getDate("dataNascimento"));
                    clienteModel.setNomeCliente(rs.getString("nomeCliente"));
                    clienteModel.setSexoCliente(rs.getString("sexoCliente"));
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
