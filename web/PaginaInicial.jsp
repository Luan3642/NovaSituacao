
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <!-- Importações Bootstrap, E importação jquery para o carousel-->  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css" />
        <link rel="icon" href="img/estadioIconPaginaInical.png" type="image/x-icon"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/estiloProprio.css">
        <title>Página inicial</title>
        <!-- Importação cabeçalho-->
        <c:import url="Cabecalho.jsp"/>
    </head>
    <body>
        <!-- Carousel-->
        <div class="carouseltelacheia">
            <div class="fullscreen img-responsive">
                <br>
                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                        <li data-target="#myCarousel" data-slide-to="3"></li>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                        <div class="item active">
                            <img src="img/Estádio-Indianapolis-6.jpg"/>
                        </div>
                        <div class="item">
                            <img src="img/maxresdefault.jpg"/>
                        </div>
                        <div class="item">
                            <img src="img/e6d76080-0ceb-11e4-909d-27b8a42daa91_manegarrincha_ae.jpg"/>
                        </div>
                        <div class="item">
                            <img src="img/imagem-30.jpg"/>
                        </div>
                    </div>
                    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
            <div class="arrumarEspacoEntreCarousel">
                <div class="container">
                    <div class="row" style=" padding-left: 8.5%">
                        <div class="col-sm-1 col-md-3">
                            <div class="thumbnail">
                                <img src="img/pessoa-icon.png" width="100px;" height="100px;">
                                <div class="caption">
                                    <h3>Cadastrar cliente</h3>
                                    <p>Cadastre-se para adiquirir algumas promoções futuras no nosso novo sistema de compra</p>  
                                    <p><a href="CadCliente.jsp" class="btn btn-primary" role="button">Cadastro</a></p>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-1 col-md-3">
                                <div class="thumbnail">
                                    <img src="img/Icon-ticket.png" width="73px;" height="73px;">
                                    <div class="caption">
                                        <h3>Compre seu ingresso</h3>
                                        <p>Aqui você efetua a compra de seu ingresso, para os melhores jogos do evento </p>
                                        <p><a href="CompraIngresso.jsp" class="btn btn-primary" role="button">Comprar</a></p>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-1 col-md-3">
                                    <div class="thumbnail">
                                        <img src="img/Cifrão_symbol.svg (1).png" width="72px;" height="72px;">
                                        <div class="caption">
                                            <h3>Consultar tabela de preços</h3>
                                            <p>Aqui você pode consultar o preço dos ingressos, de acordo com o dia e o setor</p>
                                            <p><a href="Tabela.jsp" class="btn btn-primary" role="button">Consultar</a></p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <c:import url="Rodape.jsp"/>
    </body>
</html>
