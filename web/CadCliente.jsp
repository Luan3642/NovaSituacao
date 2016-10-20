<%-- 
    Document   : CadCliente
    Created on : 20/10/2016, 10:26:54
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>cadastro</title>
    </head>
    <body>
        <table>
            <form action="ClienteServlet" method="GET">
                <td>
                <tr>
                <label> Digite o nome do cliente</label>
                <input name="nomeCliente" type="text">
                </tr>
                <tr>
                <label>Digite o cpf do cliente</label>
                <input name="cpfCliente" type="text">
                </tr>
                <tr>
                <label>Digite o sexo do cliente</label>
                <input name="sexoCliente" type="text">
                </tr>
                <tr>
                <label>Digite a idade do cliente</label>
                <input name="idade" type="text">
                </tr>
                <tr>
                <input type="submit" class="btn btn-primary" value="Gravar cliente"><br>
                </tr>
                </td>
            </form>
                </table>
                </body>
                </html>
