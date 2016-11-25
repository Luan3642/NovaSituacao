package br.com.alldirect.util;

import br.com.alldirect.controller.RegrasNegocio;
import br.com.alldirect.dao.IngressoDao;
import br.com.alldirect.dao.QntdVendidoDao;

public class TestaBanco {

    public static void main(String[] args) {
        QntdVendidoDao qtdeVendido = new QntdVendidoDao();
        System.out.println(qtdeVendido.setorAmareloJogo2());
        System.out.println("R$ " + qtdeVendido.somaVendaDosJogos());
    }
}
