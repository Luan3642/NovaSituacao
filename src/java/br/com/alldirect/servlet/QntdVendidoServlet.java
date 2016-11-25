package br.com.alldirect.servlet;

import br.com.alldirect.dao.QntdVendidoDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "QntdVendidoServlet", urlPatterns = {"/QntdVendidoServlet"})
public class QntdVendidoServlet extends HttpServlet {

     private static final long serialVersionUID = 1L;
     
     
     
    public void DoGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        QntdVendidoDao qntVendidoDao = new QntdVendidoDao();
        int setorAmarelo = qntVendidoDao.setorAmareloJogo2();
        int setorVerde = qntVendidoDao.setorVerdeJogo2();
        int setorAzul = qntVendidoDao.setorAzulJogo2();
        int setorBranco = qntVendidoDao.setorBrancoJogo2();
        
        System.out.println("Setor Amarelo vendeu : " + setorAmarelo);
        System.out.println("Setor Verde vendeu : " + setorAmarelo);
        System.out.println("Setor Azul vendeu : " + setorAmarelo);
        System.out.println("Setor Branco vendeu : " + setorAmarelo);
        }
    }

   


