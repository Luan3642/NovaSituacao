<%-- 
    Document   : PaginaCompraPrimeiroSetorAmarelo
    Created on : 18/11/2016, 10:18:39
    Author     : Aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="icon" href="img/pessoa-icon.png" type="image/x-icon"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css" />
        <link rel="icon" href="img/Icon-ticket.png" type="image/x-icon"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="Cabecalho.jsp"/>
        <div style="padding-top: 100px;"></div>
        
        <div class="col-sm-7 col-">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h2 class="painel-title">Descrição</h2>
                </div>
                <div class="panel-body">
                    <img src="img/Icon-ticket.png" class="img-responsive img-thumbnail">
                    <dl>
                        <dt>Jogo:</dt>
                        <dd>Primeiro dia</dd>
                        <dt>Setor:</dt>
                        <dd> Amarelo </dd>
                        <dt>Preço:</dt>
                        <dd>25.00</dd>
                    </dl>
                </div>
            </div>
        </div>
    </body>
    <div style="padding-top: 1000px;"></div>
    <c:import url="Rodape.jsp"/>
</html>
