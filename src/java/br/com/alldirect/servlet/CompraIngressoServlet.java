/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.servlet;

import br.com.alldirect.dao.ClienteDao;
import br.com.alldirect.dao.IngressoDao;
import br.com.alldirect.model.IngressoModel;
import br.com.alldirect.model.VendaModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CompraIngressoServlet")
public class CompraIngressoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        IngressoDao ingressoDao = new IngressoDao();
        
        int idIngresso = ingressoDao.recuperaIdIngresso();
        int qntdeVenda = Integer.parseInt(request.getParameter("qntdeVenda"));
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));

        VendaModel VendaModel = new VendaModel();
        
        
        VendaModel.setIdIngresso(idIngresso);
        VendaModel.setIdCliente(idCliente);
        VendaModel.setQntdeVenda(qntdeVenda);

        try {
            IngressoDao VendaDao = new IngressoDao();
            VendaDao.adicionarVenda(VendaModel);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
