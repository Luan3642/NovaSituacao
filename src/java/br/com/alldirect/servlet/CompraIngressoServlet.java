/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.servlet;

import br.com.alldirect.dao.ClienteDao;
import br.com.alldirect.dao.IngressoDao;
import br.com.alldirect.model.IngressoModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/CompraServlet")

public class CompraIngressoServlet extends HttpServlet {
   
    
    
 private static final long serialVersionUID = 1L;

        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
        String setorIngresso = request.getParameter("setorIngresso");
        Double valorIngresso = Double.parseDouble(request.getParameter("valorIngresso"));
        int qtdeLot = Integer.parseInt(request.getParameter("qtdeLot"));
        int jogoIngresso = Integer.parseInt(request.getParameter("jogoIngresso"));
        
        
            IngressoModel ingressoModel = new IngressoModel();
            ingressoModel.setSetorIngresso(jogoIngresso);
            ingressoModel.setValorIngresso(valorIngresso);
            ingressoModel.setJogoIngresso(jogoIngresso);
            ingressoModel.setQtdeLot(qtdeLot);
            
             try {
                IngressoDao ingressoDao = new IngressoDao();
                ingressoDao.adicionarIngresso(ingressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }     
}