<%-- 
    Document   : CadCliente
    Created on : 20/10/2016, 10:26:54
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="img/pessoa-icon.png" type="image/x-icon"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>Cadastro</title>
    </head>
    <body>
        <table>
            <form action="ClienteServlet" method="GET">
                <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <ul class="nav navbar-nav">
                            <li><a href="#">PÁGINA INICIAL</a></li>
                            <li><a href="#">CADASTAR O CLIENTE</a></li>
                            <li><a href="#">CADASTRAR O INGRESSO</a></li>
                        </ul>  
                    </div>        
                </nav>
                <h3 class="text-center"> Cadastre suas informações</h3>
                <div class="form-horizontal">
                    <div class="form-group row">
                        <label class="col-sm-2 control-label">Digite seu nome</label>
                        <div class="col-xs-9">
                            <input class="form-control" type="text" name="nomeCliente">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label  class="col-sm-2 control-label">Digite seu cpf</label>
                        <div class="col-sm-9">
                            <input class="form-control" type="text" name="cpfCliente">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 control-label">Digite sua idade</label>
                        <div class="col-sm-9">
                            <input class="form-control" type="text" name="sexoCliente">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-2 control-label">Digite o seu sexo</label>
                        <div class="col-sm-9">
                            <select class="form-control" name="idade">
                                <option>Masculino</option>
                                <option>Feminino</option>
                            </select>
                        </div>
                    </div>
                </div>
            </form>
        </table>
    </body>
</html>
