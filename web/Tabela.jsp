<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title> Tabela De Preços</title>
        <!-- Importações Bootstrap-->
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <!-- Importação cabeçalho-->
        <c:import url="Cabecalho.jsp"/>
        <div style="padding-top: 70px;">
        </div>
        <table class="table">
            <thead class="thead-inverse">
                <tr>
                    <th>Dia Do Jogo</th>
                    <th>Setor Do Jogo</th>
                    <th>Preço Do Jogo</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">Primeiro dia </th>
                    <td>Amarelo</td>
                    <td>25.00</td>
                </tr>
                <tr>
                    <th scope="row">Primeiro dia </th>
                    <td>Azul</td>
                    <td>25.00</td>
                </tr>
                <tr>
                    <th scope="row">Primeiro dia </th>
                    <td>Verde</td>
                    <td>45.00</td>
                </tr>
                <tr>
                    <th scope="row">Primeiro dia </th>
                    <td>Branco</td>
                    <td>45.00</td>
                </tr>
                <tr>
                    <th scope="row">Segundo dia</th>
                    <td>Amarelo</td>
                    <td>30.00</td>
                </tr>
                <tr>
                    <th scope="row">Segundo dia</th>
                    <td>Azul</td>
                    <td>30.00</td>
                </tr>
                <tr>
                    <th scope="row">Segundo dia</th>
                    <td>Verde</td>
                    <td>50.00</td>
                </tr>
                <tr>
                    <th scope="row">Segundo dia</th>
                    <td>Branco</td>
                    <td>50.00</td>
                </tr>
                <tr>
                </tr>
            </tbody>
        </table>
        <!-- Importação Rodapé-->
        <c:import url="Rodape.jsp"/>
    </body>
</html>