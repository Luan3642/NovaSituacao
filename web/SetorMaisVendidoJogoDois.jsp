<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <!-- Importações Bootstrap-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css"/>
        <!-- Importação para icone da imagem-->
        <link rel="icon" href="img/Cash-icon.png" type="image/x-icon"/>
        <title> Vendas </title>
    </head>
    <body>
        <jsp:useBean id= "regra" class="br.com.alldirect.controller.RegrasNegocio"/>
        <!-- Importação cabeçalho-->
        <c:import url="Cabecalho.jsp"/>
        <div style="padding-top:70px;"></div>
        <table class="table">
            <thead>
                <tr allign="center">
                    <th >O setor que mais vendeu no segundo jogo foi : </th>
                    <th>O valor total dos ingressos vendidos é:</th>
                    <th>O jogo que vendeu mais foi : </th>
                </tr>
            <tbody>
                <c:forEach var="r" items="${regra.lista}">
                    <tr>
                        <th scope="row">${r.setorMaisVendidoJogoDois}</th>
                        <td>R$${r.somaVendaDosJogos}</td>
                        <td>${r.jogoQueVendeuMais}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div style="padding-top: 250px;"></div>
        <c:import url="Rodape.jsp"/>
    </body>
</html>