<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista cliente</title>
        <link rel="icon" href="img/Clipboard-icon.png" type="image/x-icon"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
    </head>
    <body>
        <c:import url="Cabecalho.jsp"/>
        <!-- Div para arrumar o espaço de cima-->
        <div class="paddingArrumaListarClienteTopo">
        </div>
        <jsp:useBean id="dao" class="br.com.alldirect.dao.ClienteDao"/>
        <table class="table">
            <thead>
                <tr>
                    <th>Id:</th>
                    <th>Nome:</th>
                    <th>CPF:</th>
                    <th>Complemento:</th>
                    <th>Bairro:</th>
                    <th>País:</th>
                    <th>Sexo:</th>
                    <th>Idade:</th>
                </tr>
            </thead>
            <tbody>
                <!-- ForEach para percorrer o método listar-->
                <c:forEach var="c" items="${dao.lista}">
                    <tr>
                        <th scope="row">${c.idCliente}</th>
                        <td>${c.nomeCliente}</td>
                        <td>${c.cpfCliente}</td>
                        <th>${c.complemento}</th>
                        <td>${c.bairro}</td>
                        <td>${c.clientePais}</td>
                        <td>${c.sexoCliente}</td>
                        <td>${c.idade}</td>
                    </c:forEach>
            </tbody>
        </table>
        <!-- Div para arrumar o footer-->
        <div class="paddingArrumaListarCliente"></div>
        <c:import url="Rodape.jsp"/>
    </body>
</html>
