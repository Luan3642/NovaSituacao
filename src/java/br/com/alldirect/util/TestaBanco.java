package br.com.alldirect.util;
import br.com.alldirect.dao.IngressoDao;

public class TestaBanco {
    public static void main(String[] args) {
        IngressoDao ingressoDao = new IngressoDao();
        System.out.println(ingressoDao.recuperaIdIngresso());
    }
}