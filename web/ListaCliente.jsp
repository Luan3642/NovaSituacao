<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Ingresso</title>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
    </head>
    <body>
        <c:import url="Cabecalho.jsp"/>
        <div style="padding-top: 70px;">
        </div>
        <table class="table">
            <thead>
                <tr>
                    <th>Nome Cliente:</th>
                    <th>Id cliente:</th>
                    <th>CPF cliente:</th>
                    <th>Rg cliente:</th>
                    <th>Complemento cliente:</th>
                    <th>Email cliente:</th>
                    <th>Bairro cliente:</th>
                    <th>Pais cliente:</th>
                    <th>Sexo cliente:</th>
                    <th>Nome cliente:</th>
                    <th>Idade cliente:</th>
                    <th>CEP cliente:</th>
                    <th>Cidade Cliente:</th>
                    <th>Estado cliente:</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Larry</td>
                    <td>the Bird</td>
                    <td>@twitter</td>
                </tr>
            </tbody>
        </table>
        <c:import url="Rodape.jsp"/>
    </body>
</html>
