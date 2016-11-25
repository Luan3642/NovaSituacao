<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <jsp:useBean id="regra" class="br.com.alldirect.controller.RegrasNegocio"/>

        <!-- Importação cabeçalho-->
        <c:import url="Cabecalho.jsp"/>
        <div class=""></div>
        <div class="row container">
            <c:forEach var="c" items="${regra.resultados()}">
                <div>${c.SetorMaisVendido}</div>
            </c:forEach>
        </div>
    </body>
</html>