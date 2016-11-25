<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compra Ingressos</title>
    </head>
    <body>
        <!-- Importações Bootstrap-->
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
        <!-- Importação para Icone ná página-->
        <link rel="icon" href="img/Cash-icon.png" type="image/x-icon"/>
        <!-- Importação cabeçalho-->
        <c:import url="Cabecalho.jsp"/>
        <div class="container paddingArrumarPaginaDecompraIngresso">
            <div class="row">
                <div class="col-sm-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2 class="painel-title">Sua compra </h2>
                        </div>
                        <!-- Painel com Imagem dos setores-->
                        <div class="panel-body">
                            <img src="img/setor.jpg" width="300px" height="300px" class="img-responsive img-thumbnail">
                        </div>
                    </div>
                </div>
                <div class="col-sm-8">
                    <form action="ControlePreco" method="GET">
                        <!-- Campos de informação sobre o jogo-->
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
                        <br/>
                        <!--Botão de comprar rederecionando para a página de compra definitiva-->
                        <button type="submit" class="btn btn-primary ">
                            <span class="glyphicon glyphicon-thumbs-up"></span>
                            Confirmar Pedido
                        </button>
                    </form>
                </div>
            </div>
        </div>
        <br/>
        <div class="arrumarFooterPaginaCompraIngresso">
        </div>
        <!-- Importação para o Rodapé-->
        <c:import url="Rodape.jsp"/>
    </body>
</html>
