/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
public class ControlePreco {

    @WebServlet("/CompraServlet")
    public class CompraIngressoServlet extends HttpServlet {

        private static final long serialVersionUID = 1L;

        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String jogoIngresso = request.getParameter("jogoIngresso");
            String setorIngresso = request.getParameter("setorIngresso");

            if (jogoIngresso.equals("1")) {

                int idCliente = Integer.parseInt(request.getParameter("idCliente"));
                Double valorIngresso = Double.parseDouble(request.getParameter("valorIngresso"));
                int qtdeLot = Integer.parseInt(request.getParameter("qtdeLot"));

            }
            // sempre fazer ifs nunca else

            if (jogoIngresso.equals("2")) {

                int idCliente = Integer.parseInt(request.getParameter("idCliente"));
                Double valorIngresso = Double.parseDouble(request.getParameter("valorIngresso"));
                int qtdeLot = Integer.parseInt(request.getParameter("qtdeLot"));
                RequestDispatcher rd = request.getRequestDispatcher("PRECISA FAZER A PAGINA AINDA");
                rd.forward(request, response);
            }
        }
    }
}