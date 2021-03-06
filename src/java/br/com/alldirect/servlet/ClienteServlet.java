package br.com.alldirect.servlet;
//Importações do código
import br.com.alldirect.model.ClienteModel;
import br.com.alldirect.dao.ClienteDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// faz referência ao cliente servlet 
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Variáveis criadas para nomear campo web
        String nomeCliente = request.getParameter("nomeCliente");
        int cpfCliente = Integer.parseInt(request.getParameter("cpfCliente"));
        String sexoCliente = request.getParameter("sexoCliente");
        int idade = Integer.parseInt(request.getParameter("idade"));
        int rgCliente = Integer.parseInt(request.getParameter("rgCliente"));
        String emailCliente = request.getParameter("emailCliente");
        String clientePais = request.getParameter("clientePais");
        int cep = Integer.parseInt(request.getParameter("cep"));
        String complemento = request.getParameter("complemento");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");

        //Adicionando no método Cliente model 
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNomeCliente(nomeCliente);
        clienteModel.setCpfCliente(cpfCliente);
        clienteModel.setSexoCliente(sexoCliente);
        clienteModel.setIdade(idade);
        clienteModel.setRgCliente(rgCliente);
        clienteModel.setEmailCliente(emailCliente);
        clienteModel.setClientePais(clientePais);
        clienteModel.setCep(cep);
        clienteModel.setComplemento(complemento);
        clienteModel.setBairro(bairro);
        clienteModel.setCidade(cidade);
        clienteModel.setEstado(estado);

        try {
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.adicionarCliente(clienteModel);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
