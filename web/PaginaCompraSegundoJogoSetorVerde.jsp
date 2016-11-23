<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <!--Importações bootstrap-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css"/>
        <!-- Importação para icone da imagem-->
        <link rel="icon" href="img/Icon-ticket.png" type="image/x-icon"/>
        <title>Página de compra</title>
    </head>
    <body>
        <!-- Importação cabeçalho-->
        <c:import url="Cabecalho.jsp"/>
        <div class="paddingArrumarPaginaCompraCerteza"></div>
        <div class="row container">
            <div class="col-md-5"></div>
            <div class="col-md-5">
                <!-- Painel de compra-->
                <div class="panel panel-default">
                    <form action="CompraIngressoServlet" method="GET">
                        <div class="panel-heading">
                            <h2 class="painel-title">Descrição</h2>
                        </div>
                        <div class="panel-body">
                            <img src="img/Icon-ticket.png" class="img-responsive img-thumbnail">
                            <dl>
                                <label class="control-label">Digite seu id de usuário:</label>
                                <input class="form-control" placeholder="Digite seu id de usuário" name="idCliente"  value=""/>
                            </dl>
                        </div>
                        <dt>Quantidade :</dt>
                        <select name="qntdeVenda">
                            <option value="1">1</option>
                        </select>
                        <dt>Preço:</dt>
                        <dd>50.00</dd>
                        <div class="paddingArrumaBotaoPaginaCompraCerteza">
                        </div>
                        <button type="submit" class="btn btn-primary "> 
                            <a href="PaginaInicial.jsp" class="btn-default btn-primary">
                                <span class="glyphicon glyphicon-thumbs-up"></span>
                                Compra definitiva
                            </a>
                        </button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-5">
        </div>
    </div>
</body>
<div class="arrumarFooterPaginaCompra"></div>
<c:import url="Rodape.jsp"/>
</html>
