package br.com.alldirect.servlet;

import br.com.alldirect.dao.IngressoDao;
import br.com.alldirect.model.IngressoModel;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControlePreco")
public class ControlePreco extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String jogoIngresso = request.getParameter("jogoIngresso");
        String setorIngresso = request.getParameter("setorIngresso");

        if (jogoIngresso.equals("1") && setorIngresso.equals("1")) {
            RequestDispatcher rd = request.getRequestDispatcher("/PaginaCompraPrimeiroJogoSetorAmarelo.jsp");
            rd.forward(request, response);

            int setorIng = Integer.parseInt(request.getParameter("setorIngresso"));
            Double valorIngresso = 25.00;
            int jogoIng = Integer.parseInt(request.getParameter("jogoIngresso"));

            IngressoModel IngressoModel = new IngressoModel();
            IngressoModel.setSetorIngresso(setorIng);
            IngressoModel.setJogoIngresso(jogoIng);
            IngressoModel.setValorIngresso(valorIngresso);

            try {
                IngressoDao IngressoDao = new IngressoDao();
                IngressoDao.adicionarIngresso(IngressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (jogoIngresso.equals("1") && setorIngresso.equals("2")) {
            RequestDispatcher rd = request.getRequestDispatcher("/PaginaCompraPrimeiroJogoSetorAzul.jsp");
            rd.forward(request, response);
            int setorIng = Integer.parseInt(request.getParameter("setorIngresso"));
            Double valorIngresso = 25.00;
            int jogoIng = Integer.parseInt(request.getParameter("jogoIngresso"));

            IngressoModel IngressoModel = new IngressoModel();
            IngressoModel.setSetorIngresso(setorIng);
            IngressoModel.setJogoIngresso(jogoIng);
            IngressoModel.setValorIngresso(valorIngresso);

            try {
                IngressoDao IngressoDao = new IngressoDao();
                IngressoDao.adicionarIngresso(IngressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (jogoIngresso.equals("1") && setorIngresso.equals("3")) {
            RequestDispatcher rd = request.getRequestDispatcher("/PaginaCompraPrimeiroJogoSetorVerde.jsp");
            rd.forward(request, response);
            int setorIng = Integer.parseInt(request.getParameter("setorIngresso"));
            Double valorIngresso = 45.00;
            int jogoIng = Integer.parseInt(request.getParameter("jogoIngresso"));

            IngressoModel IngressoModel = new IngressoModel();
            IngressoModel.setSetorIngresso(setorIng);
            IngressoModel.setJogoIngresso(jogoIng);
            IngressoModel.setValorIngresso(valorIngresso);

            try {
                IngressoDao IngressoDao = new IngressoDao();
                IngressoDao.adicionarIngresso(IngressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jogoIngresso.equals("1") && setorIngresso.equals("4")) {
            RequestDispatcher rd = request.getRequestDispatcher("/PaginaCompraPrimeiroJogoSetorBranco.jsp");
            rd.forward(request, response);
            int setorIng = Integer.parseInt(request.getParameter("setorIngresso"));
            Double valorIngresso = 45.00;
            int jogoIng = Integer.parseInt(request.getParameter("jogoIngresso"));

            IngressoModel IngressoModel = new IngressoModel();
            IngressoModel.setSetorIngresso(setorIng);
            IngressoModel.setJogoIngresso(jogoIng);
            IngressoModel.setValorIngresso(valorIngresso);

            try {
                IngressoDao IngressoDao = new IngressoDao();
                IngressoDao.adicionarIngresso(IngressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jogoIngresso.equals("2") && setorIngresso.equals("1")) {
            RequestDispatcher rd = request.getRequestDispatcher("/PaginaCompraSegundoJogoSetorAmarelo.jsp");
            rd.forward(request, response);
            int setorIng = Integer.parseInt(request.getParameter("setorIngresso"));
            Double valorIngresso = 30.00;
            int jogoIng = Integer.parseInt(request.getParameter("jogoIngresso"));

            IngressoModel IngressoModel = new IngressoModel();
            IngressoModel.setSetorIngresso(setorIng);
            IngressoModel.setJogoIngresso(jogoIng);
            IngressoModel.setValorIngresso(valorIngresso);

            try {
                IngressoDao IngressoDao = new IngressoDao();
                IngressoDao.adicionarIngresso(IngressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jogoIngresso.equals("2") && setorIngresso.equals("2")) {
            RequestDispatcher rd = request.getRequestDispatcher("/PaginaCompraSegundoJogoSetorAzul.jsp");
            rd.forward(request, response);
            int setorIng = Integer.parseInt(request.getParameter("setorIngresso"));
            Double valorIngresso = 30.00;
            int jogoIng = Integer.parseInt(request.getParameter("jogoIngresso"));

            IngressoModel IngressoModel = new IngressoModel();
            IngressoModel.setSetorIngresso(setorIng);
            IngressoModel.setJogoIngresso(jogoIng);
            IngressoModel.setValorIngresso(valorIngresso);

            try {
                IngressoDao IngressoDao = new IngressoDao();
                IngressoDao.adicionarIngresso(IngressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jogoIngresso.equals("2") && setorIngresso.equals("3")) {
            RequestDispatcher rd = request.getRequestDispatcher("/PaginaCompraSegundoJogoSetorVerde.jsp");
            rd.forward(request, response);
            int setorIng = Integer.parseInt(request.getParameter("setorIngresso"));
            Double valorIngresso = 50.00;
            int jogoIng = Integer.parseInt(request.getParameter("jogoIngresso"));

            IngressoModel IngressoModel = new IngressoModel();
            IngressoModel.setSetorIngresso(setorIng);
            IngressoModel.setJogoIngresso(jogoIng);
            IngressoModel.setValorIngresso(valorIngresso);

            try {
                IngressoDao IngressoDao = new IngressoDao();
                IngressoDao.adicionarIngresso(IngressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (jogoIngresso.equals("2") && setorIngresso.equals("4")) {
            RequestDispatcher rd = request.getRequestDispatcher("/PaginaCompraSegundoJogoSetorBranco.jsp");
            rd.forward(request, response);
            int setorIng = Integer.parseInt(request.getParameter("setorIngresso"));
            Double valorIngresso = 50.00;
            int jogoIng = Integer.parseInt(request.getParameter("jogoIngresso"));

            IngressoModel IngressoModel = new IngressoModel();
            IngressoModel.setSetorIngresso(setorIng);
            IngressoModel.setJogoIngresso(jogoIng);
            IngressoModel.setValorIngresso(valorIngresso);

            try {
                IngressoDao IngressoDao = new IngressoDao();
                IngressoDao.adicionarIngresso(IngressoModel);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
