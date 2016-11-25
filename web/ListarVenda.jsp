<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Venda</title>
        <link rel="icon" href="img/Clipboard-icon.png" type="image/x-icon"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
    </head>
    <body>
        <c:import url="Cabecalho.jsp"/>
        <form action="VendaServlet" method="GET">
        <div style="padding-top: 70px;">
        </div>
        <jsp:useBean id="dao" class="br.com.alldirect.dao.VendaDao"/>
        <table class="table">
            <thead>
                <tr>
                    <th>Quantidade vendida:</th>
                    <th>Id cliente:</th>
                    <th>Id ingresso:</th>
                    <th>Id venda:</th>
            </thead>
            <tbody>
                <c:forEach var="c" items="${dao.lista}">
                    <tr>
                        <th scope="row">${c.qntdeVenda}</th>
                        <td>${c.idCliente}</td>
                        <td>${c.idIngresso}</td>
                        <th>${c.idVenda} <a href="VendaServlet?acao=Excluir&id=${c.idVenda}" 
                                            <button type="submit" class="btn btn-danger ">
                                    <span class="glyphicon glyphicon-remove-sign"></span>
                                    Excluir venda
                                </button></th>
                            </c:forEach>
            </tbody>
        </table>
        </form>
        <div class="paddingArrumaListarCliente"></div>
        
        <c:import url="Rodape.jsp"/>
    </body>
</html>