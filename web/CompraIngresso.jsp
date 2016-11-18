
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compra Ingressos</title>
    </head>
    <body>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="icon" href="img/pessoa-icon.png" type="image/x-icon"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css" />
        <link rel="icon" href="img/Icon-ticket.png" type="image/x-icon"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
        <c:import url="Cabecalho.jsp"/>
        <div class="container" style="padding-top: 80px">
            <div class="row">
                <div class="col-sm-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2 class="painel-title">Sua compra </h2>
                        </div>
                        <div class="panel-body">
                            <img src="img/setor.jpg" width="300px" height="300px" class="img-responsive img-thumbnail">
                        </div>
                    </div>
                </div>
                <div class="col-sm-8">
                    <form>
                        <fieldset>
                            <legend>Informações de compra </legend>
                            <div class="form-group">
                                <label>Escolha o jogo:</label>
                                <select class="form-control" name="jogoIngresso">
                                    <option value="1">Primeiro jogo</option>
                                    <option value="2">Segundo jogo</option>                                   
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Escolha o setor:</label>
                                <select class="form-control" name="setorIngresso">
                                    <option value="1">Amarelo</option>
                                    <option value="2">Azul</option>
                                    <option value="3">Verde</option>
                                    <option value="4">Branco</option>
                                </select>
                            </div>
                        </fieldset>
                        <fieldset>
                            <legend> Forma de pagamento</legend>
                            <div class="form-group">
                                <label for="bandeira">Bandeira:</label>
                                <select  id="bandeira" class="form-control">
                                    <option value="visa">Visa</option>
                                    <option value="visa">Mastercard</option>
                                    <option value="visa">American Express</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="senha" > Digite o número do cartão </label>
                                <input id="senha" class="form-control" type="text" />
                            </div>
                            <div class="form-group">
                                <label for="validade">Validade do cartão</label>
                                <input id="validade" type="month" class="form-control" />
                            </div>
                        </fieldset>
                        <br/>
                        <button type="submit" class="btn btn-primary "> 
                            <a href="CompraRealizada.html" class="  btn-default btn-primary">
                                <span class="glyphicon glyphicon-thumbs-up"></span>
                                Confirmar Pedido
                            </a>
                        </button>
                    </form>
                </div>
            </div>
        </div>
        <br/>
        <div style="padding-top: 20px;">
        </div>
        <c:import url="Rodape.jsp"/>
    </body>
</html>
