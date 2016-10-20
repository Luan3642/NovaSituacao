/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.servlet;

import br.com.alldirect.model.ClienteModel;
import br.com.alldirect.dao.ClienteDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */


    @WebServlet("/ClienteServlet")
    public class ClienteServlet extends HttpServlet {

        private static final long serialVersionUID = 1L;

        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String  nomeCliente = request.getParameter("nomeCliente");
            int  cpfCliente = Integer.parseInt(request.getParameter("cpfCliente"));
            String sexoCliente = request.getParameter("sexoCliente");
            int idade  =  Integer.parseInt(request.getParameter("idade"));

            ClienteModel clienteModel = new ClienteModel();
            clienteModel.setNomeCliente(nomeCliente);
            clienteModel.setCpfCliente (cpfCliente);
            clienteModel.setSexoCliente(sexoCliente);
            clienteModel.setIdade(idade);
            
            
           

            try {
                ClienteDao clienteDao = new ClienteDao();
                clienteDao.adicionarCliente(clienteModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

