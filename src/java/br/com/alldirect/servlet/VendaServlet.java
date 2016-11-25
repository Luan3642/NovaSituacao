/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.servlet;

import br.com.alldirect.dao.IngressoDao;
import br.com.alldirect.dao.VendaDao;
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
        String id = request.getParameter("id");
        
        System.out.println("Acao: "+ acao);
        System.out.println("Id: " + id);
        
        if ("Excluir".equals(acao)) {
            IngressoDao ingressoDao = new IngressoDao();
            //String id = request.getParameter("id");
            ingressoDao.removerIngresso(Integer.parseInt(id));
            RequestDispatcher rd = request.getRequestDispatcher("/ListarVenda.jsp");
            rd.forward(request, response);
        }     
    }
}


