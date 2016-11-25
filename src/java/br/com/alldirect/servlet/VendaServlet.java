/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.servlet;

import br.com.alldirect.dao.IngressoDao;
import br.com.alldirect.model.VendaModel;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VendaServlet")
public class VendaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");

        if ("Excluir".equals(acao)) {
            VendaModel vendaModel = new VendaModel();
            String id = request.getParameter("idVenda");
            vendaModel.setIdVenda(Integer.parseInt(id));
            RequestDispatcher rd = request.getRequestDispatcher("/listaVenda.jsp");
            rd.forward(request, response);
        }

        if (!("Excluir".equals(acao))){
            int idVenda = Integer.parseInt(request.getParameter("idVenda"));
            int qntdeVenda = Integer.parseInt(request.getParameter("qntdeVenda"));
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            int idIngresso = Integer.parseInt(request.getParameter("idIngresso"));
             
            VendaModel vendaModel = new VendaModel();
            
            vendaModel.setIdCliente(idCliente);
            vendaModel.setIdIngresso(idIngresso);
            vendaModel.setIdVenda(idVenda);
            vendaModel.setQntdeVenda(qntdeVenda);
            
            IngressoDao ingressoDao = new IngressoDao();
            ingressoDao.adicionarIngresso(ingresso);

            RequestDispatcher rd = request.getRequestDispatcher("/listaProdutos.jsp");
            rd.forward(request, response);
        }

    }
}


